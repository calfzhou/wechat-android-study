package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.an;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class s extends an
{
  private final l bQ;
  private v bR = null;
  private ArrayList bS = new ArrayList();
  private ArrayList bT = new ArrayList();
  private Fragment bU = null;

  public s(l paraml)
  {
    this.bQ = paraml;
  }

  public final void B()
  {
    if (this.bR != null)
    {
      this.bR.commitAllowingStateLoss();
      this.bR = null;
      this.bQ.executePendingTransactions();
    }
  }

  public final Parcelable C()
  {
    int i = this.bS.size();
    Bundle localBundle1 = null;
    if (i > 0)
    {
      localBundle1 = new Bundle();
      Fragment.SavedState[] arrayOfSavedState = new Fragment.SavedState[this.bS.size()];
      this.bS.toArray(arrayOfSavedState);
      localBundle1.putParcelableArray("states", arrayOfSavedState);
    }
    int j = 0;
    Bundle localBundle2 = localBundle1;
    while (j < this.bT.size())
    {
      Fragment localFragment = (Fragment)this.bT.get(j);
      if (localFragment != null)
      {
        if (localBundle2 == null)
          localBundle2 = new Bundle();
        String str = "f" + j;
        this.bQ.a(localBundle2, str, localFragment);
      }
      j++;
    }
    return localBundle2;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.bT.size() > paramInt)
    {
      Fragment localFragment2 = (Fragment)this.bT.get(paramInt);
      if (localFragment2 != null)
        return localFragment2;
    }
    if (this.bR == null)
      this.bR = this.bQ.p();
    Fragment localFragment1 = e(paramInt);
    Fragment.SavedState localSavedState;
    if (this.bS.size() > paramInt)
    {
      localSavedState = (Fragment.SavedState)this.bS.get(paramInt);
      if (localSavedState != null)
      {
        if (localFragment1.mIndex >= 0)
          throw new IllegalStateException("Fragment already active");
        if ((localSavedState == null) || (localSavedState.aT == null))
          break label151;
      }
    }
    label151: for (Bundle localBundle = localSavedState.aT; ; localBundle = null)
    {
      localFragment1.ah = localBundle;
      while (this.bT.size() <= paramInt)
        this.bT.add(null);
    }
    localFragment1.setMenuVisibility(false);
    localFragment1.setUserVisibleHint(false);
    this.bT.set(paramInt, localFragment1);
    this.bR.a(paramViewGroup.getId(), localFragment1);
    return localFragment1;
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Bundle localBundle = (Bundle)paramParcelable;
      localBundle.setClassLoader(paramClassLoader);
      Parcelable[] arrayOfParcelable = localBundle.getParcelableArray("states");
      this.bS.clear();
      this.bT.clear();
      if (arrayOfParcelable != null)
        for (int j = 0; j < arrayOfParcelable.length; j++)
          this.bS.add((Fragment.SavedState)arrayOfParcelable[j]);
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith("f"))
        {
          int i = Integer.parseInt(str.substring(1));
          Fragment localFragment = this.bQ.a(localBundle, str);
          if (localFragment != null)
          {
            while (this.bT.size() <= i)
              this.bT.add(null);
            localFragment.setMenuVisibility(false);
            this.bT.set(i, localFragment);
          }
        }
      }
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (this.bR == null)
      this.bR = this.bQ.p();
    while (this.bS.size() <= paramInt)
      this.bS.add(null);
    this.bS.set(paramInt, this.bQ.d(localFragment));
    this.bT.set(paramInt, null);
    this.bR.a(localFragment);
  }

  public final void a(Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (localFragment != this.bU)
    {
      if (this.bU != null)
      {
        this.bU.setMenuVisibility(false);
        this.bU.setUserVisibleHint(false);
      }
      if (localFragment != null)
      {
        localFragment.setMenuVisibility(true);
        localFragment.setUserVisibleHint(true);
      }
      this.bU = localFragment;
    }
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).aL == paramView;
  }

  public abstract Fragment e(int paramInt);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.s
 * JD-Core Version:    0.6.2
 */
package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost
  implements TabHost.OnTabChangeListener
{
  private int aA;
  private l bQ;
  private final ArrayList bV = new ArrayList();
  private FrameLayout bW;
  private TabHost.OnTabChangeListener bX;
  private u bY;
  private boolean bZ;
  private Context mContext;

  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.aA = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
    if (findViewById(16908307) == null)
    {
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setOrientation(1);
      addView(localLinearLayout, new FrameLayout.LayoutParams(-1, -1));
      TabWidget localTabWidget = new TabWidget(paramContext);
      localTabWidget.setId(16908307);
      localTabWidget.setOrientation(0);
      localLinearLayout.addView(localTabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0F));
      FrameLayout localFrameLayout1 = new FrameLayout(paramContext);
      localFrameLayout1.setId(16908305);
      localLinearLayout.addView(localFrameLayout1, new LinearLayout.LayoutParams(0, 0, 0.0F));
      FrameLayout localFrameLayout2 = new FrameLayout(paramContext);
      this.bW = localFrameLayout2;
      this.bW.setId(this.aA);
      localLinearLayout.addView(localFrameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0F));
    }
  }

  private v a(String paramString, v paramv)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < this.bV.size())
    {
      localObject2 = (u)this.bV.get(i);
      if (!u.b((u)localObject2).equals(paramString))
        break label199;
    }
    while (true)
    {
      i++;
      localObject1 = localObject2;
      break;
      if (localObject1 == null)
        throw new IllegalStateException("No tab known for tag " + paramString);
      if (this.bY != localObject1)
      {
        if (paramv == null)
          paramv = this.bQ.p();
        if ((this.bY != null) && (u.a(this.bY) != null))
          paramv.b(u.a(this.bY));
        if (localObject1 != null)
        {
          if (u.a(localObject1) != null)
            break label187;
          u.a(localObject1, Fragment.a(this.mContext, u.c(localObject1).getName(), u.d(localObject1)));
          paramv.a(this.aA, u.a(localObject1), u.b(localObject1));
        }
      }
      while (true)
      {
        this.bY = localObject1;
        return paramv;
        label187: paramv.c(u.a(localObject1));
      }
      label199: localObject2 = localObject1;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    v localv1 = null;
    int i = 0;
    if (i < this.bV.size())
    {
      u localu = (u)this.bV.get(i);
      u.a(localu, this.bQ.d(u.b(localu)));
      if ((u.a(localu) != null) && (!u.a(localu).aD))
      {
        if (!u.b(localu).equals(str))
          break label98;
        this.bY = localu;
      }
      while (true)
      {
        i++;
        break;
        label98: if (localv1 == null)
          localv1 = this.bQ.p();
        localv1.b(u.a(localu));
      }
    }
    this.bZ = true;
    v localv2 = a(str, localv1);
    if (localv2 != null)
    {
      localv2.commit();
      this.bQ.executePendingTransactions();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.bZ = false;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    FragmentTabHost.SavedState localSavedState = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setCurrentTabByTag(localSavedState.ca);
  }

  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.ca = getCurrentTabTag();
    return localSavedState;
  }

  public void onTabChanged(String paramString)
  {
    if (this.bZ)
    {
      v localv = a(paramString, null);
      if (localv != null)
        localv.commit();
    }
    if (this.bX != null)
      this.bX.onTabChanged(paramString);
  }

  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.bX = paramOnTabChangeListener;
  }

  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.6.2
 */
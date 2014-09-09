package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;

final class s extends BaseAdapter
{
  private j og;
  private int oh = 4;
  private boolean oi;
  private boolean oj;
  private boolean ok;

  private s(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void H(int paramInt)
  {
    if (this.oh != paramInt)
    {
      this.oh = paramInt;
      notifyDataSetChanged();
    }
  }

  public final void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.oi != paramBoolean1) || (this.oj != paramBoolean2))
    {
      this.oi = paramBoolean1;
      this.oj = paramBoolean2;
      notifyDataSetChanged();
    }
  }

  public final int cA()
  {
    return this.og.cA();
  }

  public final ResolveInfo cB()
  {
    return this.og.cB();
  }

  public final int cL()
  {
    int i = 0;
    int j = this.oh;
    this.oh = 2147483647;
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getCount();
    View localView = null;
    int i1 = 0;
    while (i < n)
    {
      localView = getView(i, localView, null);
      localView.measure(k, m);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      i++;
    }
    this.oh = j;
    return i1;
  }

  public final j cM()
  {
    return this.og;
  }

  public final boolean cN()
  {
    return this.oi;
  }

  public final int getCount()
  {
    int i = this.og.cA();
    if ((!this.oi) && (this.og.cB() != null))
      i--;
    int j = Math.min(i, this.oh);
    if (this.ok)
      j++;
    return j;
  }

  public final int getHistorySize()
  {
    return this.og.getHistorySize();
  }

  public final Object getItem(int paramInt)
  {
    switch (getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      return null;
    case 0:
    }
    if ((!this.oi) && (this.og.cB() != null))
      paramInt++;
    return this.og.E(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if ((this.ok) && (paramInt == -1 + getCount()))
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    switch (getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      if ((paramView == null) || (paramView.getId() != 1))
      {
        paramView = LayoutInflater.from(this.of.getContext()).inflate(k.bap, paramViewGroup, false);
        paramView.setId(1);
        ((TextView)paramView.findViewById(i.title)).setText(this.of.getContext().getString(n.brp));
      }
      break;
    case 0:
    }
    do
    {
      return paramView;
      if ((paramView == null) || (paramView.getId() != i.aAf))
        paramView = LayoutInflater.from(this.of.getContext()).inflate(k.bap, paramViewGroup, false);
      PackageManager localPackageManager = this.of.getContext().getPackageManager();
      ImageView localImageView = (ImageView)paramView.findViewById(i.icon);
      ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
      localImageView.setImageDrawable(localResolveInfo.loadIcon(localPackageManager));
      ((TextView)paramView.findViewById(i.title)).setText(localResolveInfo.loadLabel(localPackageManager));
    }
    while ((!this.oi) || (paramInt != 0));
    return paramView;
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final void w(boolean paramBoolean)
  {
    if (this.ok != paramBoolean)
    {
      this.ok = paramBoolean;
      notifyDataSetChanged();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.s
 * JD-Core Version:    0.6.2
 */
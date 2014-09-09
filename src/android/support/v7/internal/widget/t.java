package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v4.view.n;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

final class t
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private t(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.of))
    {
      this.of.cI();
      ResolveInfo localResolveInfo = ActivityChooserView.a(this.of).cB();
      int i = ActivityChooserView.a(this.of).cM().a(localResolveInfo);
      Intent localIntent = ActivityChooserView.a(this.of).cM().F(i);
      if (localIntent != null)
      {
        localIntent.addFlags(524288);
        this.of.getContext().startActivity(localIntent);
      }
      return;
    }
    if (paramView == ActivityChooserView.f(this.of))
    {
      ActivityChooserView.a(this.of, false);
      ActivityChooserView.a(this.of, ActivityChooserView.g(this.of));
      return;
    }
    throw new IllegalArgumentException();
  }

  public final void onDismiss()
  {
    if (ActivityChooserView.h(this.of) != null)
      ActivityChooserView.h(this.of).onDismiss();
    if (this.of.nW != null)
      this.of.nW.c(false);
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (((s)paramAdapterView.getAdapter()).getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      ActivityChooserView.a(this.of, 2147483647);
    case 0:
    }
    do
    {
      return;
      this.of.cI();
      if (!ActivityChooserView.d(this.of))
        break;
    }
    while (paramInt <= 0);
    ActivityChooserView.a(this.of).cM().G(paramInt);
    return;
    if (ActivityChooserView.a(this.of).cN());
    while (true)
    {
      Intent localIntent = ActivityChooserView.a(this.of).cM().F(paramInt);
      if (localIntent == null)
        break;
      localIntent.addFlags(524288);
      this.of.getContext().startActivity(localIntent);
      return;
      paramInt++;
    }
  }

  public final boolean onLongClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.of))
    {
      if (ActivityChooserView.a(this.of).getCount() > 0)
      {
        ActivityChooserView.a(this.of, true);
        ActivityChooserView.a(this.of, ActivityChooserView.g(this.of));
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.t
 * JD-Core Version:    0.6.2
 */
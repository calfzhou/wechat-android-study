package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class d
  implements AdapterView.OnItemClickListener
{
  d(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (AppChooserUI.a(this.hKu) != null)
    {
      AppChooserUI.a(this.hKu, AppChooserUI.a(this.hKu).nn(paramInt));
      AppChooserUI.a(this.hKu).notifyDataSetChanged();
      if ((AppChooserUI.b(this.hKu) != null) && (AppChooserUI.b(this.hKu).isShowing()))
      {
        if ((AppChooserUI.c(this.hKu) == null) || (!AppChooserUI.c(this.hKu).hKE) || ((AppChooserUI.c(this.hKu).eZh) && ((AppChooserUI.c(this.hKu).hKF) || (AppChooserUI.d(this.hKu) >= AppChooserUI.e(this.hKu)))))
          break label140;
        AppChooserUI.b(this.hKu).dY(false);
      }
    }
    return;
    label140: AppChooserUI.b(this.hKu).dY(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.model.app.ae;

final class f
  implements View.OnClickListener
{
  f(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppAttachDownloadUI.j(this.jlF);
    AppAttachDownloadUI.g(this.jlF).setVisibility(0);
    AppAttachDownloadUI.h(this.jlF).setVisibility(8);
    AppAttachDownloadUI.i(this.jlF).setVisibility(0);
    AppAttachDownloadUI.a(this.jlF, new ae(AppAttachDownloadUI.k(this.jlF), AppAttachDownloadUI.l(this.jlF), AppAttachDownloadUI.m(this.jlF)));
    bg.qX().d(AppAttachDownloadUI.a(this.jlF));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f
 * JD-Core Version:    0.6.2
 */
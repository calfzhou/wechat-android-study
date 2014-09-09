package com.tencent.mm.plugin.safedevice.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;

final class ag
  implements View.OnClickListener
{
  ag(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    b.jF(bg.qS() + "," + getClass().getName() + ",L600_300," + bg.eg("L600_300") + ",1");
    SharedPreferences localSharedPreferences = this.fUC.getSharedPreferences(ak.aHi(), 0);
    String str = y.d(localSharedPreferences);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", String.format("http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android", new Object[] { str }));
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("title", this.fUC.getString(n.cbR));
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("neverGetA8Key", true);
    a.dWo.h(localIntent, this.fUC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ag
 * JD-Core Version:    0.6.2
 */
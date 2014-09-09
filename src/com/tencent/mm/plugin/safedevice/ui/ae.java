package com.tencent.mm.plugin.safedevice.ui;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class ae
  implements View.OnClickListener
{
  ae(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("!56@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BvdzSLyYUwo0jcenzQx7SDA==", "on resend verify code button click");
    SecurityAccountVerifyUI.b(this.fUC).setVisibility(8);
    SecurityAccountVerifyUI.a(this.fUC).setTag(Integer.valueOf(60));
    SecurityAccountVerifyUI.c(this.fUC).aNu();
    SecurityAccountVerifyUI.c(this.fUC).cP(1000L);
    ai localai = new ai(SecurityAccountVerifyUI.d(this.fUC), 10, "", 0, "", SecurityAccountVerifyUI.e(this.fUC));
    bg.qX().d(localai);
    SecurityAccountVerifyUI localSecurityAccountVerifyUI = this.fUC;
    ActionBarActivity localActionBarActivity = this.fUC.aPI();
    this.fUC.getString(n.buo);
    SecurityAccountVerifyUI.a(localSecurityAccountVerifyUI, e.a(localActionBarActivity, this.fUC.getString(n.cbU), true, new af(this, localai)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ae
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.n;
import com.tencent.mm.o.r;
import com.tencent.mm.o.s;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class bx
  implements s
{
  bx(bw parambw)
  {
  }

  public final void mj()
  {
    bw.a(this.jor).reset();
    bw.b(this.jor).aNu();
    bw.c(this.jor).aNu();
    as.AP("keep_app_silent");
    bw.d(this.jor).St();
    bw.e(this.jor).aUr();
    z.v("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "record stop on error");
    bw.f(this.jor).eB(true);
    bw.f(this.jor).eA(true);
    Toast.makeText(bw.f(this.jor).agh(), bw.f(this.jor).agh().getString(n.bzZ), 0).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bx
 * JD-Core Version:    0.6.2
 */
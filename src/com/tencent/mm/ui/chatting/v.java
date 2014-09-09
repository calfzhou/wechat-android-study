package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.tencent.mm.c.a.kd;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a.rk;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.y;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;

final class v
  implements y
{
  v(u paramu, String paramString, ou paramou)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    kd localkd;
    do
    {
      return;
      Intent localIntent = new Intent();
      try
      {
        Object[] arrayOfObject3 = new Object[5];
        arrayOfObject3[0] = URLEncoder.encode(this.jmt, "UTF-8");
        arrayOfObject3[1] = URLEncoder.encode(this.jmu.juE, "UTF-8");
        arrayOfObject3[2] = Long.valueOf(this.jmu.cMM.kl());
        arrayOfObject3[3] = Integer.valueOf((int)(this.jmu.cMM.kn() / 1000L));
        arrayOfObject3[4] = Integer.valueOf(42);
        localIntent.putExtra("rawUrl", String.format("http://mp.weixin.qq.com/mp/readtemplate?t=wxm-appmsg-inform&bizusername=%s&tid=%s&mid=%s&mtime=%s&scene=%s#wechat_redirect", arrayOfObject3));
        localIntent.putExtra("show_bottom", false);
        localIntent.putExtra("showShare", false);
        com.tencent.mm.am.a.b(u.a(this.jmv).h(), "webview", ".ui.tools.WebViewUI", localIntent);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localUnsupportedEncodingException.getMessage();
        z.e("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "exception in expore, %s", arrayOfObject2);
        return;
      }
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = this.jmt;
      arrayOfObject1[1] = this.jmu.juE;
      z.d("!44@/B4Tb64lLpIspjrGglFY27cir3zuhRM08q/5rhpDM1Q=", "refulse, fromUserName = %s, templateId = %s", arrayOfObject1);
      bg.qX().a(1030, this.jmv);
      rk localrk = new rk();
      localrk.hOG = 1;
      localrk.ihl = this.jmu.juE;
      localrk.cCD = "";
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localrk);
      localkd = new kd();
      localkd.cNV.cMU = this.jmt;
      localkd.cNV.cNW = localLinkedList;
    }
    while (!com.tencent.mm.sdk.c.a.aGB().g(localkd));
    u localu = this.jmv;
    FragmentActivity localFragmentActivity = u.a(this.jmv).h();
    u.a(this.jmv).getString(n.buo);
    u.a(localu, e.a(localFragmentActivity, u.a(this.jmv).getString(n.buA), true, new w(this)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.v
 * JD-Core Version:    0.6.2
 */
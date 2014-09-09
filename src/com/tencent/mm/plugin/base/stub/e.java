package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.z;

public final class e
{
  private String appId;
  private Context context;
  private String ehE;
  private h ehF;

  public e(Context paramContext, String paramString1, String paramString2, h paramh)
  {
    this.context = paramContext;
    this.appId = paramString1;
    this.ehE = paramString2;
    this.ehF = paramh;
  }

  public final void HJ()
  {
    if ((this.ehE == null) || (this.ehE.length() == 0))
    {
      z.w("!32@/B4Tb64lLpJzC/9YxIg88yo3n7Lv0eKR", "doCheck, openId is null");
      this.ehF.aq(true);
      return;
    }
    k localk = l.F(this.appId, false);
    if (localk == null)
    {
      z.e("!32@/B4Tb64lLpJzC/9YxIg88yo3n7Lv0eKR", "doCheck fail, local app is null, appId = " + this.appId);
      this.ehF.aq(true);
      return;
    }
    if (ap.jb(localk.field_openId))
    {
      z.w("!32@/B4Tb64lLpJzC/9YxIg88yo3n7Lv0eKR", "doCheck fail, local openId is null, appId = " + this.appId);
      z.d("!32@/B4Tb64lLpJzC/9YxIg88yo3n7Lv0eKR", "doCheck, trigger getappsetting, appId = " + this.appId);
      bf.azc().vd(this.appId);
      this.ehF.aq(true);
      return;
    }
    if (this.ehE.equalsIgnoreCase(localk.field_openId))
    {
      z.d("!32@/B4Tb64lLpJzC/9YxIg88yo3n7Lv0eKR", "doCheck succ, appId = " + this.appId);
      this.ehF.aq(true);
      return;
    }
    z.w("!32@/B4Tb64lLpJzC/9YxIg88yo3n7Lv0eKR", "doCheck fail, appId = " + this.appId + ", openId = " + this.ehE + ", localOpenId = " + localk.field_openId);
    com.tencent.mm.ui.base.e.b(this.context, n.bUI, n.buo, new f(this), new g(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.e
 * JD-Core Version:    0.6.2
 */
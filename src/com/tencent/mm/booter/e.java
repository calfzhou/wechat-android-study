package com.tencent.mm.booter;

import android.content.Intent;
import com.tencent.mm.network.a;
import com.tencent.mm.network.ao;
import com.tencent.mm.platformtools.k;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements az
{
  e(CoreService paramCoreService)
  {
  }

  public final boolean kJ()
  {
    if (!CoreService.a(this.dhG).get())
    {
      z.e("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "checker frequency limited");
      return true;
    }
    Intent localIntent = new Intent(this.dhG, NotifyReceiver.class);
    localIntent.putExtra("notify_option_type", 1);
    localIntent.putExtra("notify_uin", CoreService.b(this.dhG).Da().oD());
    try
    {
      this.dhG.sendBroadcast(localIntent);
      return true;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.toString();
      z.f("!32@/B4Tb64lLpIzvC/moQitzBn6RBAuk+sd", "checker frequency limited hasDestroyed %s", arrayOfObject);
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.e
 * JD-Core Version:    0.6.2
 */
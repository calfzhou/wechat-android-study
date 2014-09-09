package com.tencent.mm.sandbox.updater;

import android.os.Message;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class ac extends Thread
{
  ac(aa paramaa, vo paramvo)
  {
  }

  public final void run()
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "updateByPatch start");
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = this.iBW;
    Long localLong = Long.valueOf(System.currentTimeMillis());
    int i = an.e(ak.getContext(), this.iBV.aMt(), this.iBV.aMu(), aa.c(this.iBV));
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "gen new apk finish, time cost = " + (System.currentTimeMillis() - localLong.longValue()));
    if (i == 0)
    {
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "updateByPatch ok");
      localMessage.arg1 = 0;
      aa.d(this.iBV).sendMessage(localMessage);
    }
    do
    {
      return;
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "updateByPatch error in genNewAPKInNewThread()");
      File localFile = new File(this.iBV.aMu());
      if (localFile.exists())
        localFile.delete();
      if (i == -1)
      {
        z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "RET_GEN_APK_ERR");
        localMessage.arg1 = 3;
        aa.d(this.iBV).sendMessage(localMessage);
        return;
      }
    }
    while (i != -2);
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "RET_APK_MD5_ERR");
    localMessage.arg1 = 4;
    aa.d(this.iBV).sendMessage(localMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ac
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.network;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class bo
  implements az
{
  bo(bn parambn)
  {
  }

  public final boolean kJ()
  {
    int i = bn.b(this.dUp).beginBroadcast();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpJlhWc9y/UzPIrDGDo3IGi4", "listeners ct : %d", arrayOfObject);
    int j = i - 1;
    while (true)
    {
      ag localag;
      if (j >= 0)
        localag = (ag)bn.b(this.dUp).getBroadcastItem(j);
      try
      {
        localag.aW(bn.c(this.dUp));
        label69: j--;
        continue;
        bn.b(this.dUp).finishBroadcast();
        return false;
      }
      catch (RemoteException localRemoteException)
      {
        break label69;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bo
 * JD-Core Version:    0.6.2
 */
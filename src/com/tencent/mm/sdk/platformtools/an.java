package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;

final class an
  implements aq
{
  an(am paramam, ar paramar, Object paramObject)
  {
  }

  public final boolean rD()
  {
    z.d("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "syncReset doInBackground");
    am.b(this.ifm).quit();
    if (this.ifk != null)
      this.ifk.rl();
    am.c(this.ifm);
    synchronized (this.ifl)
    {
      this.ifl.notify();
      return true;
    }
  }

  public final boolean rE()
  {
    z.d("!44@/B4Tb64lLpL3oiL6hKHAvThbRhKPm3M1xCJeuhmnaK8=", "syncReset onPostExecute");
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.an
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.jni.platformcomm;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class WakerLock
{
  private static final String TAG = "!32@/B4Tb64lLpLSCksk5w/QSxQTciH9sVsR";
  private cm mHandler = null;
  private Runnable mReleaser = new g(this);
  private PowerManager.WakeLock wakeLock = null;

  public WakerLock(Context paramContext)
  {
    this.wakeLock = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "!32@/B4Tb64lLpLSCksk5w/QSxQTciH9sVsR");
    this.wakeLock.setReferenceCounted(false);
    this.mHandler = new cm(paramContext.getMainLooper());
  }

  protected void finalize()
  {
    unLock();
  }

  public boolean isLocking()
  {
    try
    {
      boolean bool = this.wakeLock.isHeld();
      return bool;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLSCksk5w/QSxQTciH9sVsR", localException, "", new Object[] { "" });
    }
    return false;
  }

  public void lock()
  {
    this.mHandler.removeCallbacks(this.mReleaser);
    try
    {
      this.wakeLock.acquire();
      return;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLSCksk5w/QSxQTciH9sVsR", localException, "", new Object[] { "" });
    }
  }

  public void lock(long paramLong)
  {
    lock();
    this.mHandler.postDelayed(this.mReleaser, paramLong);
  }

  public void unLock()
  {
    this.mHandler.removeCallbacks(this.mReleaser);
    if (this.wakeLock.isHeld());
    try
    {
      this.wakeLock.release();
      return;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLSCksk5w/QSxQTciH9sVsR", localException, "", new Object[] { "" });
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.platformcomm.WakerLock
 * JD-Core Version:    0.6.2
 */
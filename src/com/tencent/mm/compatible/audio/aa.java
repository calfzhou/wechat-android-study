package com.tencent.mm.compatible.audio;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

final class aa
{
  private static ac dKQ = new ac();
  private ad dKR = null;
  private BlockingQueue ddq = new ArrayBlockingQueue(1024);
  private boolean ddr = false;
  private FileOutputStream dds;
  private String ddt;
  private int ddu;
  private boolean ddv = false;
  private int ddw = 1;
  private int ddx = 0;

  private boolean d(int paramInt, String paramString)
  {
    if (paramString == null)
      return false;
    this.ddu = paramInt;
    this.ddt = paramString;
    SimpleMediaRecorder.s(0L);
    try
    {
      this.dds = new FileOutputStream(this.ddt);
      this.dds.write("#!AMR\n".getBytes());
      this.dds.flush();
      SimpleMediaRecorder.mH();
      return true;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "init Amr out file Error" + localException.getMessage());
    }
    return false;
  }

  public final void i(byte[] paramArrayOfByte, int paramInt)
  {
    z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "push into queue queueLen:" + this.ddq.size() + " buf:" + paramInt);
    SimpleMediaRecorder.s(SimpleMediaRecorder.mI() + paramInt);
    if (paramInt <= 0)
      return;
    if (this.dKR == null)
    {
      this.dKR = new ad(this, (byte)0);
      this.dKR.start();
    }
    this.ddq.add(new ab(paramArrayOfByte, paramInt));
  }

  // ERROR //
  public final boolean mh()
  {
    // Byte code:
    //   0: ldc 80
    //   2: ldc 219
    //   4: invokestatic 131	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 40	com/tencent/mm/compatible/audio/aa:ddr	Z
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_0
    //   17: getfield 48	com/tencent/mm/compatible/audio/aa:dKR	Lcom/tencent/mm/compatible/audio/ad;
    //   20: invokevirtual 222	com/tencent/mm/compatible/audio/ad:join	()V
    //   23: iconst_0
    //   24: ireturn
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    //   30: astore_2
    //   31: goto -8 -> 23
    //
    // Exception table:
    //   from	to	target	type
    //   9	16	25	finally
    //   16	23	30	java/lang/InterruptedException
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.aa
 * JD-Core Version:    0.6.2
 */
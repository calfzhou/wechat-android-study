package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class j
{
  private static l dGI = new l();
  private i dGH = new i();
  private m dGJ = null;
  private BlockingQueue ddq = new ArrayBlockingQueue(1024);
  private boolean ddr = false;
  private FileOutputStream dds;
  private String ddt;
  private int ddu;
  private boolean ddv = false;
  private int ddw = 1;
  private int ddx = 0;

  public final boolean d(int paramInt, String paramString)
  {
    if (paramString == null)
      return false;
    this.ddu = paramInt;
    this.ddt = paramString;
    MediaRecorder.X(0L);
    try
    {
      this.dds = new FileOutputStream(this.ddt);
      this.dds.write("#!AMR\n".getBytes());
      this.dds.flush();
      this.dGH.eN(this.ddu);
      return true;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "init Amr out file Error" + localException.getMessage());
    }
    return false;
  }

  public final void i(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    Object[] arrayOfObject = new Object[3];
    int j;
    if (this.ddq == null)
    {
      j = i;
      arrayOfObject[0] = Integer.valueOf(j);
      if (paramArrayOfByte != null)
        break label85;
    }
    while (true)
    {
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = Integer.valueOf(paramInt);
      z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "AMRWriter pushBuf queueLen:%d bufLen:%d len:%d", arrayOfObject);
      MediaRecorder.X(MediaRecorder.Bj() + paramInt);
      if (paramInt > 0)
        break label91;
      return;
      j = this.ddq.size();
      break;
      label85: i = paramArrayOfByte.length;
    }
    label91: if (this.dGJ == null)
    {
      this.dGJ = new m(this, (byte)0);
      this.dGJ.start();
    }
    this.ddq.add(new k(paramArrayOfByte, paramInt));
  }

  // ERROR //
  public final boolean mh()
  {
    // Byte code:
    //   0: ldc 88
    //   2: ldc 237
    //   4: invokestatic 239	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 42	com/tencent/mm/modelvoice/j:ddr	Z
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_0
    //   17: getfield 55	com/tencent/mm/modelvoice/j:dGJ	Lcom/tencent/mm/modelvoice/m;
    //   20: invokevirtual 242	com/tencent/mm/modelvoice/m:join	()V
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
 * Qualified Name:     com.tencent.mm.modelvoice.j
 * JD-Core Version:    0.6.2
 */
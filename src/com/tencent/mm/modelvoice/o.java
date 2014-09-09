package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class o
{
  private static q dGP = new q();
  private int dGE = 16000;
  private BlockingQueue dGL = new ArrayBlockingQueue(1024);
  private int dGM = 0;
  private byte[] dGN = null;
  private Object dGO = new Object();
  private r dGQ = null;
  private int ddl = 16000;
  private boolean ddr = false;
  private FileOutputStream dds;
  private String ddt;
  private boolean ddv = false;
  private int ddw = 1;
  private int ddx = 0;

  public o(int paramInt)
  {
    this.ddl = paramInt;
    this.dGE = paramInt;
  }

  public final void i(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    Object[] arrayOfObject = new Object[3];
    int j;
    if (this.dGL == null)
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
      z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter pushBuf queueLen:%d bufLen:%d len:%d", arrayOfObject);
      MediaRecorder.X(MediaRecorder.Bj() + paramInt);
      if (paramInt > 0)
        break label91;
      return;
      j = this.dGL.size();
      break;
      label85: i = paramArrayOfByte.length;
    }
    label91: if (this.dGQ == null)
    {
      this.dGQ = new r(this, (byte)0);
      this.dGQ.start();
    }
    this.dGL.add(new p(paramArrayOfByte, paramInt));
  }

  public final boolean im(String paramString)
  {
    if (paramString == null)
    {
      z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter initWriter outFile:%s", new Object[] { paramString });
      return false;
    }
    z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter initWriter outFile:%s", new Object[] { paramString });
    this.ddt = paramString;
    MediaRecorder.X(0L);
    while (true)
    {
      int i;
      int j;
      try
      {
        this.dds = new FileOutputStream(this.ddt);
        i = com.tencent.mm.compatible.c.p.mU();
        if ((i & 0x400) != 0)
        {
          j = 4;
          int k = MediaRecorder.SilkEncInit(this.ddl, this.dGE, j);
          if (k == 0)
            break;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(k);
          z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter initWriter SilkEncoderInit Error:%d", arrayOfObject2);
          return false;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter initWriter FileOutputStream error:%s", arrayOfObject1);
        return false;
      }
      if ((i & 0x200) != 0)
      {
        j = 2;
      }
      else
      {
        z.e("TAG", "SilkWriter initWriter cpuType error! silk don't support arm_v5!!!!");
        return false;
      }
    }
    this.dGN = new byte[2 * (20 * this.ddl) / 1000];
    return true;
  }

  // ERROR //
  public final boolean mh()
  {
    // Byte code:
    //   0: ldc 113
    //   2: ldc_w 294
    //   5: invokestatic 217	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield 46	com/tencent/mm/modelvoice/o:ddr	Z
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_0
    //   18: getfield 64	com/tencent/mm/modelvoice/o:dGQ	Lcom/tencent/mm/modelvoice/r;
    //   21: invokevirtual 297	com/tencent/mm/modelvoice/r:join	()V
    //   24: iconst_0
    //   25: ireturn
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    //   31: astore_2
    //   32: goto -8 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   10	17	26	finally
    //   17	24	31	java/lang/InterruptedException
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.o
 * JD-Core Version:    0.6.2
 */
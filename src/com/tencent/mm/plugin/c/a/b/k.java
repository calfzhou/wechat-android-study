package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothSocket;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;

public final class k extends Thread
{
  private f eiZ = null;
  private a eja = null;
  private volatile Thread ejf = null;
  private OutputStream ejg = null;
  private final LinkedList ejh = new LinkedList();
  private final LinkedList eji = new LinkedList();

  public k(f paramf, a parama, BluetoothSocket paramBluetoothSocket)
  {
    this.eiZ = paramf;
    this.eja = parama;
    try
    {
      OutputStream localOutputStream = paramBluetoothSocket.getOutputStream();
      this.ejf = this;
      this.ejg = localOutputStream;
      return;
    }
    catch (IOException localIOException)
    {
      do
      {
        z.e("!44@/B4Tb64lLpLHXwcx366fGpPL4OWk2194XakDpu69+pg=", "temp sockets not created", new Object[] { localIOException });
        this.ejg = null;
      }
      while (this.eja == null);
      this.eja.eiP.b(this.eiZ.ein, 11, "Can not get write stream");
    }
  }

  public final boolean O(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramArrayOfByte.length);
    z.i("!44@/B4Tb64lLpLHXwcx366fGpPL4OWk2194XakDpu69+pg=", "------write------buffer length = %d", arrayOfObject);
    if (this.ejf == null)
    {
      z.e("!44@/B4Tb64lLpLHXwcx366fGpPL4OWk2194XakDpu69+pg=", "Send thread has been close. Send data abort");
      return false;
    }
    this.ejh.add(paramArrayOfByte);
    return true;
  }

  public final void cancel()
  {
    this.ejf = null;
    this.eji.clear();
    this.ejh.clear();
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 45
    //   2: ldc 104
    //   4: invokestatic 106	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: aload_0
    //   8: getfield 26	com/tencent/mm/plugin/c/a/b/k:ejg	Ljava/io/OutputStream;
    //   11: ifnonnull +31 -> 42
    //   14: return
    //   15: astore 4
    //   17: aload_0
    //   18: getfield 37	com/tencent/mm/plugin/c/a/b/k:eja	Lcom/tencent/mm/plugin/c/a/b/a;
    //   21: ifnull +21 -> 42
    //   24: aload_0
    //   25: getfield 37	com/tencent/mm/plugin/c/a/b/k:eja	Lcom/tencent/mm/plugin/c/a/b/a;
    //   28: getfield 61	com/tencent/mm/plugin/c/a/b/a:eiP	Lcom/tencent/mm/plugin/c/a/b/d;
    //   31: aload_0
    //   32: getfield 35	com/tencent/mm/plugin/c/a/b/k:eiZ	Lcom/tencent/mm/plugin/c/a/b/f;
    //   35: getfield 67	com/tencent/mm/plugin/c/a/b/f:ein	J
    //   38: iconst_0
    //   39: invokevirtual 110	com/tencent/mm/plugin/c/a/b/d:c	(JZ)V
    //   42: aload_0
    //   43: getfield 24	com/tencent/mm/plugin/c/a/b/k:ejf	Ljava/lang/Thread;
    //   46: ifnonnull +11 -> 57
    //   49: ldc 45
    //   51: ldc 112
    //   53: invokestatic 115	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: return
    //   57: aload_0
    //   58: getfield 33	com/tencent/mm/plugin/c/a/b/k:eji	Ljava/util/LinkedList;
    //   61: invokevirtual 119	java/util/LinkedList:isEmpty	()Z
    //   64: ifne +50 -> 114
    //   67: aload_0
    //   68: getfield 33	com/tencent/mm/plugin/c/a/b/k:eji	Ljava/util/LinkedList;
    //   71: invokevirtual 123	java/util/LinkedList:pop	()Ljava/lang/Object;
    //   74: checkcast 125	[B
    //   77: astore_3
    //   78: aload_0
    //   79: getfield 26	com/tencent/mm/plugin/c/a/b/k:ejg	Ljava/io/OutputStream;
    //   82: aload_3
    //   83: invokevirtual 131	java/io/OutputStream:write	([B)V
    //   86: aload_0
    //   87: getfield 37	com/tencent/mm/plugin/c/a/b/k:eja	Lcom/tencent/mm/plugin/c/a/b/a;
    //   90: ifnull -48 -> 42
    //   93: aload_0
    //   94: getfield 37	com/tencent/mm/plugin/c/a/b/k:eja	Lcom/tencent/mm/plugin/c/a/b/a;
    //   97: getfield 61	com/tencent/mm/plugin/c/a/b/a:eiP	Lcom/tencent/mm/plugin/c/a/b/d;
    //   100: aload_0
    //   101: getfield 35	com/tencent/mm/plugin/c/a/b/k:eiZ	Lcom/tencent/mm/plugin/c/a/b/f;
    //   104: getfield 67	com/tencent/mm/plugin/c/a/b/f:ein	J
    //   107: iconst_1
    //   108: invokevirtual 110	com/tencent/mm/plugin/c/a/b/d:c	(JZ)V
    //   111: goto -69 -> 42
    //   114: aload_0
    //   115: getfield 31	com/tencent/mm/plugin/c/a/b/k:ejh	Ljava/util/LinkedList;
    //   118: astore_1
    //   119: aload_1
    //   120: monitorenter
    //   121: aload_0
    //   122: getfield 31	com/tencent/mm/plugin/c/a/b/k:ejh	Ljava/util/LinkedList;
    //   125: invokevirtual 119	java/util/LinkedList:isEmpty	()Z
    //   128: ifne +24 -> 152
    //   131: aload_0
    //   132: getfield 33	com/tencent/mm/plugin/c/a/b/k:eji	Ljava/util/LinkedList;
    //   135: aload_0
    //   136: getfield 31	com/tencent/mm/plugin/c/a/b/k:ejh	Ljava/util/LinkedList;
    //   139: invokevirtual 135	java/util/LinkedList:addAll	(Ljava/util/Collection;)Z
    //   142: invokestatic 141	junit/framework/Assert:assertTrue	(Z)V
    //   145: aload_0
    //   146: getfield 31	com/tencent/mm/plugin/c/a/b/k:ejh	Ljava/util/LinkedList;
    //   149: invokevirtual 101	java/util/LinkedList:clear	()V
    //   152: aload_1
    //   153: monitorexit
    //   154: goto -112 -> 42
    //   157: astore_2
    //   158: aload_1
    //   159: monitorexit
    //   160: aload_2
    //   161: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   78	86	15	java/io/IOException
    //   121	152	157	finally
    //   152	154	157	finally
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.k
 * JD-Core Version:    0.6.2
 */
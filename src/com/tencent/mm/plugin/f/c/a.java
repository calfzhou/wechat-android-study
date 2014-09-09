package com.tencent.mm.plugin.f.c;

import android.util.SparseArray;
import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.a.e;
import com.tencent.mm.plugin.f.b.p;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import junit.framework.Assert;

final class a
  implements m
{
  private SparseArray fTk = new SparseArray();
  private SparseArray fTl = new SparseArray();
  private final ArrayList fTm = new ArrayList();
  private final Object lock = new byte[0];

  private int a(e parame)
  {
    boolean bool;
    if (parame != null)
      bool = true;
    com.tencent.mm.plugin.f.a.a locala2;
    while (true)
    {
      Assert.assertTrue("info must not be null", bool);
      com.tencent.mm.plugin.f.a.a locala1 = (com.tencent.mm.plugin.f.a.a)parame;
      synchronized (this.lock)
      {
        locala2 = (com.tencent.mm.plugin.f.a.a)this.fTk.get(locala1.hUh);
        if (locala2 == null)
        {
          z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "click count : not found record");
          locala2 = new com.tencent.mm.plugin.f.a.a();
          locala2.hUh = locala1.hUh;
          locala2.iwN = "";
          locala2.hUm = locala1.hUm;
        }
        locala2.hUn = locala1.hUn;
        locala2.iwM = (1 + locala2.iwM);
        this.fTk.put(locala2.hUh, locala2);
        if (locala2 == null)
        {
          return 0;
          bool = false;
        }
      }
    }
    return locala2.iwM;
  }

  private static String aeT()
  {
    if (bg.oE())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = bg.qW().pq();
      arrayOfObject[1] = f.d("__file_user_action__".getBytes());
      return String.format("%s/%s", arrayOfObject);
    }
    return "";
  }

  private SparseArray aeU()
  {
    SparseArray localSparseArray1;
    synchronized (this.lock)
    {
      localSparseArray1 = this.fTk;
      SparseArray localSparseArray2 = this.fTl;
      this.fTk = new SparseArray();
      this.fTl = new SparseArray();
      int i = 0;
      if (i < localSparseArray2.size())
      {
        com.tencent.mm.plugin.f.a.a locala = (com.tencent.mm.plugin.f.a.a)localSparseArray2.valueAt(i);
        localSparseArray1.put(locala.hUh, locala);
        i++;
      }
    }
    return localSparseArray1;
  }

  // ERROR //
  private com.tencent.mm.plugin.f.a.b aeV()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: invokespecial 132	com/tencent/mm/plugin/f/c/a:aeU	()Landroid/util/SparseArray;
    //   8: astore_3
    //   9: invokestatic 134	com/tencent/mm/plugin/f/c/a:aeT	()Ljava/lang/String;
    //   12: astore 4
    //   14: aload 4
    //   16: ifnonnull +12 -> 28
    //   19: ldc 53
    //   21: ldc 136
    //   23: invokestatic 139	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: aconst_null
    //   27: areturn
    //   28: iload_1
    //   29: anewarray 4	java/lang/Object
    //   32: astore 5
    //   34: aload 5
    //   36: iconst_0
    //   37: aload 4
    //   39: aastore
    //   40: ldc 53
    //   42: ldc 141
    //   44: aload 5
    //   46: invokestatic 144	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: aload 4
    //   51: invokestatic 149	com/tencent/mm/sdk/platformtools/ch:oE	(Ljava/lang/String;)[B
    //   54: astore 6
    //   56: iload_1
    //   57: anewarray 4	java/lang/Object
    //   60: astore 7
    //   62: aload 6
    //   64: ifnonnull +165 -> 229
    //   67: iload_1
    //   68: istore 8
    //   70: aload 7
    //   72: iconst_0
    //   73: iload 8
    //   75: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   78: aastore
    //   79: ldc 53
    //   81: ldc 157
    //   83: aload 7
    //   85: invokestatic 144	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload 6
    //   90: ifnull +280 -> 370
    //   93: aload 6
    //   95: arraylength
    //   96: ifle +274 -> 370
    //   99: new 159	com/tencent/mm/plugin/f/a/b
    //   102: dup
    //   103: invokespecial 160	com/tencent/mm/plugin/f/a/b:<init>	()V
    //   106: aload 6
    //   108: invokevirtual 164	com/tencent/mm/plugin/f/a/b:ak	([B)Lcom/tencent/mm/plugin/f/a/b;
    //   111: astore 20
    //   113: aload 20
    //   115: astore 9
    //   117: aload 4
    //   119: invokestatic 170	com/tencent/mm/plugin/f/c/q:pV	(Ljava/lang/String;)Z
    //   122: ifne +9 -> 131
    //   125: aload 4
    //   127: invokestatic 173	com/tencent/mm/sdk/platformtools/ch:deleteFile	(Ljava/lang/String;)Z
    //   130: pop
    //   131: iload_1
    //   132: anewarray 4	java/lang/Object
    //   135: astore 10
    //   137: aload 9
    //   139: ifnonnull +137 -> 276
    //   142: aload 10
    //   144: iconst_0
    //   145: iload_1
    //   146: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   149: aastore
    //   150: ldc 53
    //   152: ldc 175
    //   154: aload 10
    //   156: invokestatic 144	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload 9
    //   161: ifnull +160 -> 321
    //   164: aload 9
    //   166: getfield 179	com/tencent/mm/plugin/f/a/b:fSL	Ljava/util/LinkedList;
    //   169: invokevirtual 185	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   172: astore 13
    //   174: aload 13
    //   176: invokeinterface 190 1 0
    //   181: ifeq +140 -> 321
    //   184: aload 13
    //   186: invokeinterface 194 1 0
    //   191: checkcast 43	com/tencent/mm/plugin/f/a/a
    //   194: astore 14
    //   196: aload_3
    //   197: aload 14
    //   199: getfield 47	com/tencent/mm/plugin/f/a/a:hUh	I
    //   202: invokevirtual 51	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   205: checkcast 43	com/tencent/mm/plugin/f/a/a
    //   208: astore 15
    //   210: aload 15
    //   212: ifnonnull +69 -> 281
    //   215: aload_3
    //   216: aload 14
    //   218: getfield 47	com/tencent/mm/plugin/f/a/a:hUh	I
    //   221: aload 14
    //   223: invokevirtual 81	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   226: goto -52 -> 174
    //   229: iconst_0
    //   230: istore 8
    //   232: goto -162 -> 70
    //   235: astore 18
    //   237: aload 4
    //   239: invokestatic 170	com/tencent/mm/plugin/f/c/q:pV	(Ljava/lang/String;)Z
    //   242: ifne +128 -> 370
    //   245: aload 4
    //   247: invokestatic 173	com/tencent/mm/sdk/platformtools/ch:deleteFile	(Ljava/lang/String;)Z
    //   250: pop
    //   251: aconst_null
    //   252: astore 9
    //   254: goto -123 -> 131
    //   257: astore 16
    //   259: aload 4
    //   261: invokestatic 170	com/tencent/mm/plugin/f/c/q:pV	(Ljava/lang/String;)Z
    //   264: ifne +9 -> 273
    //   267: aload 4
    //   269: invokestatic 173	com/tencent/mm/sdk/platformtools/ch:deleteFile	(Ljava/lang/String;)Z
    //   272: pop
    //   273: aload 16
    //   275: athrow
    //   276: iconst_0
    //   277: istore_1
    //   278: goto -136 -> 142
    //   281: aload 15
    //   283: aload 14
    //   285: getfield 71	com/tencent/mm/plugin/f/a/a:hUm	I
    //   288: putfield 71	com/tencent/mm/plugin/f/a/a:hUm	I
    //   291: aload 15
    //   293: aload 14
    //   295: getfield 77	com/tencent/mm/plugin/f/a/a:iwM	I
    //   298: aload 15
    //   300: getfield 77	com/tencent/mm/plugin/f/a/a:iwM	I
    //   303: iadd
    //   304: putfield 77	com/tencent/mm/plugin/f/a/a:iwM	I
    //   307: aload_3
    //   308: aload 15
    //   310: getfield 47	com/tencent/mm/plugin/f/a/a:hUh	I
    //   313: aload 15
    //   315: invokevirtual 81	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   318: goto -144 -> 174
    //   321: new 159	com/tencent/mm/plugin/f/a/b
    //   324: dup
    //   325: invokespecial 160	com/tencent/mm/plugin/f/a/b:<init>	()V
    //   328: astore 11
    //   330: iload_2
    //   331: aload_3
    //   332: invokevirtual 123	android/util/SparseArray:size	()I
    //   335: if_icmpge +23 -> 358
    //   338: aload 11
    //   340: getfield 179	com/tencent/mm/plugin/f/a/b:fSL	Ljava/util/LinkedList;
    //   343: aload_3
    //   344: iload_2
    //   345: invokevirtual 126	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   348: invokevirtual 198	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   351: pop
    //   352: iinc 2 1
    //   355: goto -25 -> 330
    //   358: aload 11
    //   360: aload_3
    //   361: invokevirtual 123	android/util/SparseArray:size	()I
    //   364: putfield 201	com/tencent/mm/plugin/f/a/b:fSK	I
    //   367: aload 11
    //   369: areturn
    //   370: aconst_null
    //   371: astore 9
    //   373: goto -242 -> 131
    //
    // Exception table:
    //   from	to	target	type
    //   99	113	235	java/lang/Exception
    //   99	113	257	finally
  }

  public final x aeS()
  {
    com.tencent.mm.plugin.f.a.b localb = aeV();
    if ((localb != null) && (localb.fSK > 0))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(localb.fSK);
      z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "userActionList.size is %d", arrayOfObject);
      LinkedList localLinkedList1 = localb.fSL;
      Object localObject = null;
      if (localLinkedList1 != null)
      {
        LinkedList localLinkedList2 = new LinkedList();
        Iterator localIterator = localb.fSL.iterator();
        while (localIterator.hasNext())
          localLinkedList2.add((com.tencent.mm.plugin.f.a.a)localIterator.next());
        localObject = localLinkedList2;
      }
      return new p(localObject);
    }
    z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "userActionList.size is 0, return null");
    return null;
  }

  public final int b(e parame)
  {
    if ((parame == null) || (parame.getType() != 3))
      return 0;
    a(parame);
    return 0;
  }

  public final void clear()
  {
  }

  public final void save()
  {
    z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "do save");
    try
    {
      com.tencent.mm.plugin.f.a.b localb = aeV();
      if (localb == null)
        return;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localb.toString();
      z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "userActionList = %s", arrayOfObject1);
      String str = aeT();
      z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "history file name = %s", new Object[] { str });
      if (localb.fSK > 0)
      {
        ch.f(str, localb.toByteArray());
        z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "save useraction list ok!");
      }
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localb.fSK);
      z.d("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "list size is %d", arrayOfObject2);
      return;
    }
    catch (IOException localIOException)
    {
      z.w("!56@/B4Tb64lLpJ8UIzwdDxM7C4yzA7rytNY/zEV7JBhpQHVBJct2wKACg==", "save error");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.a
 * JD-Core Version:    0.6.2
 */
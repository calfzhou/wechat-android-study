package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mm.protocal.c;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class bi
{
  private final bj[] dTX = new bj[100];

  private int es(int paramInt)
  {
    for (int i = 0; (i < 100) && ((this.dTX[i] == null) || (paramInt != this.dTX[i].dTY.hashCode())); i++);
    if (100 <= i)
      i = -1;
    return i;
  }

  final boolean Dg()
  {
    bj[] arrayOfbj = this.dTX;
    int i = 0;
    while (true)
    {
      if (i < 100);
      try
      {
        if ((this.dTX[i] != null) && (380 == this.dTX[i].dTY.getType()))
        {
          z.w("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "hasAuthCmd Auth inQueue: netid=" + i);
          return true;
        }
        i++;
      }
      catch (RemoteException localRemoteException)
      {
        return false;
      }
      finally
      {
      }
    }
  }

  final ak Dh()
  {
    bj[] arrayOfbj = this.dTX;
    int i = 0;
    ak localak = null;
    while (true)
    {
      if (i < 100);
      try
      {
        if (this.dTX[i] != null)
        {
          if (380 == this.dTX[i].dTY.getType())
          {
            z.e("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "getAutoAuthRR Auth inQueue: netid=" + i);
            return null;
          }
          if (localak == null)
            localak = this.dTX[i].dTY;
        }
        i++;
      }
      catch (RemoteException localRemoteException)
      {
        return localak;
      }
      finally
      {
      }
    }
  }

  public final int a(ak paramak, ac paramac, n paramn, int paramInt)
  {
    int i = paramak.hashCode();
    MMNativeNetComm.NetCmd localNetCmd = new MMNativeNetComm.NetCmd();
    bj[] arrayOfbj = this.dTX;
    int j = 0;
    if (j < 100);
    while (true)
    {
      try
      {
        if (this.dTX[j] == null)
        {
          z.i("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "startTask inQueue: netid=" + j);
          this.dTX[j] = new bj(0);
          this.dTX[j].dTY = paramak;
          this.dTX[j].dTZ = paramac;
          this.dTX[j].dUa = paramn;
          this.dTX[j].startTime = ch.CM();
          localNetCmd.reqCmdID = paramak.tN().getCmdId();
          localNetCmd.respCmdID = paramak.tO().getCmdId();
          localNetCmd.uri = paramak.getUri();
          int k = paramak.getType();
          if ((0x1 & paramak.tl()) != 1)
          {
            bool = true;
            localNetCmd.isSessionCmd = bool;
            if ((k == 126) || (k == 380))
              localNetCmd.isSessionCmd = false;
            localNetCmd.isFlowLimit = true;
            if ((k == 149) || (k == 193) || (k == 220) || (k == 323) || (k == 324) || (k == 326) || (k == 327))
              localNetCmd.isFlowLimit = false;
            localNetCmd.netStrategy = 0;
            if (k == 233)
              localNetCmd.netStrategy = 1;
            localNetCmd.isNotResp = false;
            if ((k == 10) || (k == 268369922))
              localNetCmd.isNotResp = true;
            if ((paramak.tN().tM()) && (paramak.getUri() != null) && (paramak.getUri().length() > 0))
              localNetCmd.networkType = (0x1 | localNetCmd.networkType);
            if (localNetCmd.reqCmdID != 0)
              localNetCmd.networkType = (0x2 | localNetCmd.networkType);
            localNetCmd.rtType = k;
            z.i("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", " startTask info hashcode=" + i + ", networktype=" + localNetCmd.networkType + ", reqCmdID=" + localNetCmd.reqCmdID + ", respCmdID=" + localNetCmd.respCmdID + ", uri=" + localNetCmd.uri + ", isSessionCmd=" + localNetCmd.isSessionCmd);
            if (-1 != j)
            {
              if (paramInt == 1)
                localNetCmd.cmduser_retrycount = 0;
              Java2C.startTask(i, localNetCmd, paramInt);
            }
            z.i("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "startTask retsult=" + j);
            return j;
          }
          boolean bool = false;
          continue;
        }
      }
      catch (RemoteException localRemoteException)
      {
        j++;
        break;
      }
      finally
      {
      }
      j = -1;
    }
  }

  // ERROR //
  final void a(int paramInt1, int paramInt2, String paramString, int paramInt3, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray 4	java/lang/Object
    //   4: astore 6
    //   6: aload 6
    //   8: iconst_0
    //   9: iload_1
    //   10: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   13: aastore
    //   14: aload 6
    //   16: iconst_1
    //   17: iload_2
    //   18: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: aastore
    //   22: aload 6
    //   24: iconst_2
    //   25: aload_3
    //   26: aastore
    //   27: aload 6
    //   29: iconst_3
    //   30: iload 4
    //   32: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: aastore
    //   36: ldc 35
    //   38: ldc 195
    //   40: aload 6
    //   42: invokestatic 198	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: iconst_m1
    //   46: istore 7
    //   48: aload_0
    //   49: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   52: astore 8
    //   54: aload 8
    //   56: monitorenter
    //   57: aload_0
    //   58: iload 4
    //   60: invokespecial 200	com/tencent/mm/network/bi:es	(I)I
    //   63: istore 10
    //   65: iconst_m1
    //   66: iload 10
    //   68: if_icmpne +535 -> 603
    //   71: iconst_4
    //   72: anewarray 4	java/lang/Object
    //   75: astore 11
    //   77: aload 11
    //   79: iconst_0
    //   80: iload_1
    //   81: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   84: aastore
    //   85: aload 11
    //   87: iconst_1
    //   88: iload_2
    //   89: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   92: aastore
    //   93: aload 11
    //   95: iconst_2
    //   96: aload_3
    //   97: aastore
    //   98: aload 11
    //   100: iconst_3
    //   101: iload 4
    //   103: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   106: aastore
    //   107: ldc 35
    //   109: ldc 202
    //   111: aload 11
    //   113: invokestatic 204	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload 8
    //   118: monitorexit
    //   119: return
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: astore 28
    //   126: aload 28
    //   128: iconst_0
    //   129: iload_1
    //   130: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: aastore
    //   134: ldc 35
    //   136: ldc 206
    //   138: aload 28
    //   140: invokestatic 209	com/tencent/mm/sdk/platformtools/z:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: iconst_0
    //   144: istore 12
    //   146: goto +514 -> 660
    //   149: invokestatic 215	com/tencent/mm/network/bk:Dk	()Lcom/tencent/mm/network/bm;
    //   152: getfield 220	com/tencent/mm/network/bm:dUk	Z
    //   155: ifne +22 -> 177
    //   158: iload 12
    //   160: iconst_1
    //   161: if_icmpne +16 -> 177
    //   164: ldc 35
    //   166: ldc 222
    //   168: invokestatic 73	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   171: iconst_2
    //   172: istore 12
    //   174: iconst_m1
    //   175: istore 13
    //   177: aload_0
    //   178: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   181: iload 10
    //   183: aaload
    //   184: getfield 20	com/tencent/mm/network/bj:dTY	Lcom/tencent/mm/network/ak;
    //   187: astore 14
    //   189: aload_0
    //   190: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   193: iload 10
    //   195: aaload
    //   196: getfield 80	com/tencent/mm/network/bj:dTZ	Lcom/tencent/mm/network/ac;
    //   199: astore 15
    //   201: aload_0
    //   202: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   205: iload 10
    //   207: aaload
    //   208: getfield 94	com/tencent/mm/network/bj:startTime	J
    //   211: lstore 16
    //   213: aload_0
    //   214: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   217: iload 10
    //   219: aconst_null
    //   220: aastore
    //   221: iload 12
    //   223: ifne +67 -> 290
    //   226: aload 14
    //   228: invokeinterface 111 1 0
    //   233: invokeinterface 225 1 0
    //   238: ifeq +52 -> 290
    //   241: iconst_4
    //   242: istore 12
    //   244: aload 14
    //   246: invokeinterface 111 1 0
    //   251: invokeinterface 225 1 0
    //   256: istore 13
    //   258: iconst_2
    //   259: anewarray 4	java/lang/Object
    //   262: astore 27
    //   264: aload 27
    //   266: iconst_0
    //   267: iconst_4
    //   268: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   271: aastore
    //   272: aload 27
    //   274: iconst_1
    //   275: iload 13
    //   277: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   280: aastore
    //   281: ldc 35
    //   283: ldc 227
    //   285: aload 27
    //   287: invokestatic 198	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: aload 14
    //   292: invokeinterface 33 1 0
    //   297: istore 25
    //   299: invokestatic 231	com/tencent/mm/network/bk:Do	()Lcom/tencent/mm/network/ao;
    //   302: iload 12
    //   304: iload 13
    //   306: aload_3
    //   307: aload 14
    //   309: aload 5
    //   311: invokevirtual 236	com/tencent/mm/network/ao:a	(IILjava/lang/String;Lcom/tencent/mm/network/ak;[B)V
    //   314: iload 25
    //   316: istore 7
    //   318: iload 13
    //   320: istore 19
    //   322: iload 12
    //   324: istore 20
    //   326: aload 8
    //   328: monitorexit
    //   329: bipush 6
    //   331: anewarray 4	java/lang/Object
    //   334: astore 21
    //   336: aload 21
    //   338: iconst_0
    //   339: iload 7
    //   341: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   344: aastore
    //   345: aload 21
    //   347: iconst_1
    //   348: iload 4
    //   350: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   353: aastore
    //   354: aload 21
    //   356: iconst_2
    //   357: iload 20
    //   359: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   362: aastore
    //   363: aload 21
    //   365: iconst_3
    //   366: iload 19
    //   368: invokestatic 193	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   371: aastore
    //   372: aload 21
    //   374: iconst_4
    //   375: aload_3
    //   376: aastore
    //   377: aload 21
    //   379: iconst_5
    //   380: invokestatic 90	com/tencent/mm/sdk/platformtools/ch:CM	()J
    //   383: lload 16
    //   385: lsub
    //   386: invokestatic 241	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   389: aastore
    //   390: ldc 35
    //   392: ldc 243
    //   394: aload 21
    //   396: invokestatic 198	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: aload 14
    //   401: invokeinterface 111 1 0
    //   406: invokeinterface 246 1 0
    //   411: astore 24
    //   413: aload 24
    //   415: ifnull +154 -> 569
    //   418: aload 24
    //   420: invokevirtual 149	java/lang/String:length	()I
    //   423: ifle +146 -> 569
    //   426: aload 15
    //   428: iload 10
    //   430: iload 20
    //   432: iload 19
    //   434: aload 24
    //   436: aload 14
    //   438: aload 5
    //   440: invokeinterface 251 7 0
    //   445: return
    //   446: astore 22
    //   448: iconst_1
    //   449: anewarray 4	java/lang/Object
    //   452: astore 23
    //   454: aload 23
    //   456: iconst_0
    //   457: aload 22
    //   459: invokevirtual 254	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   462: aastore
    //   463: ldc 35
    //   465: ldc_w 256
    //   468: aload 23
    //   470: invokestatic 204	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: return
    //   474: iconst_0
    //   475: istore 12
    //   477: goto +183 -> 660
    //   480: iconst_2
    //   481: istore 12
    //   483: goto +177 -> 660
    //   486: iconst_2
    //   487: istore 12
    //   489: goto +171 -> 660
    //   492: iconst_1
    //   493: istore 12
    //   495: goto +165 -> 660
    //   498: iconst_1
    //   499: istore 12
    //   501: goto +159 -> 660
    //   504: iconst_1
    //   505: istore 12
    //   507: goto +153 -> 660
    //   510: iconst_1
    //   511: istore 12
    //   513: goto +147 -> 660
    //   516: sipush -10001
    //   519: iload_2
    //   520: if_icmpne +10 -> 530
    //   523: bipush 6
    //   525: istore 12
    //   527: goto +133 -> 660
    //   530: iconst_5
    //   531: istore 12
    //   533: goto +127 -> 660
    //   536: iconst_4
    //   537: istore 12
    //   539: goto +121 -> 660
    //   542: iconst_1
    //   543: istore 12
    //   545: goto +115 -> 660
    //   548: astore 18
    //   550: iload 13
    //   552: istore 19
    //   554: iload 12
    //   556: istore 20
    //   558: goto -232 -> 326
    //   561: astore 9
    //   563: aload 8
    //   565: monitorexit
    //   566: aload 9
    //   568: athrow
    //   569: aload 15
    //   571: iload 10
    //   573: iload 20
    //   575: iload 19
    //   577: aload_3
    //   578: aload 14
    //   580: aload 5
    //   582: invokeinterface 251 7 0
    //   587: return
    //   588: astore 26
    //   590: iload 25
    //   592: istore 7
    //   594: goto -44 -> 550
    //   597: iload_2
    //   598: istore 13
    //   600: goto +68 -> 668
    //   603: iload_1
    //   604: tableswitch	default:+-484 -> 120, 0:+-130->474, 1:+-124->480, 2:+-118->486, 3:+-112->492, 4:+-106->498, 5:+-100->504, 6:+-94->510, 7:+-88->516, 8:+-68->536, 9:+-62->542
    //   661: fconst_1
    //   662: ifne -65 -> 597
    //   665: iconst_0
    //   666: istore 13
    //   668: iload 12
    //   670: iconst_3
    //   671: if_icmpne -522 -> 149
    //   674: iconst_m1
    //   675: istore 13
    //   677: goto -528 -> 149
    //
    // Exception table:
    //   from	to	target	type
    //   399	413	446	java/lang/Exception
    //   418	445	446	java/lang/Exception
    //   569	587	446	java/lang/Exception
    //   226	241	548	android/os/RemoteException
    //   244	290	548	android/os/RemoteException
    //   290	299	548	android/os/RemoteException
    //   57	65	561	finally
    //   71	119	561	finally
    //   120	143	561	finally
    //   149	158	561	finally
    //   164	171	561	finally
    //   177	221	561	finally
    //   226	241	561	finally
    //   244	290	561	finally
    //   290	299	561	finally
    //   299	314	561	finally
    //   326	329	561	finally
    //   299	314	588	android/os/RemoteException
  }

  final int buf2Resp(int paramInt, byte[] paramArrayOfByte, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    int i = -1;
    int j;
    synchronized (this.dTX)
    {
      j = es(paramInt);
      if (i == j)
        return i;
    }
    try
    {
      byte[] arrayOfByte = this.dTX[j].dTY.tN().tK();
      f localf = this.dTX[j].dTY.tO();
      if (localf.a(this.dTX[j].dTY.getType(), paramArrayOfByte, arrayOfByte))
      {
        if (localf.tC() != null)
          paramByteArrayOutputStream.write(localf.tC());
        int k = localf.tQ();
        if (-13 == k)
          i = -13;
      }
      while (true)
      {
        label140: return i;
        localObject = finally;
        throw localObject;
        if (-3001 != localf.tQ())
          break;
        i = -3001;
        continue;
        z.e("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "buf to resp failed, change server and try again");
      }
    }
    catch (RemoteException localRemoteException)
    {
      break label140;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        continue;
        i = 0;
      }
    }
  }

  // ERROR //
  public final void d(int paramInt1, int paramInt2, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc 35
    //   5: new 37	java/lang/StringBuilder
    //   8: dup
    //   9: ldc_w 282
    //   12: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: iload_1
    //   16: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   19: ldc_w 284
    //   22: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: iload_2
    //   26: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   29: ldc_w 286
    //   32: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: aload_3
    //   36: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokestatic 73	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: invokestatic 289	com/tencent/mm/network/Java2C:clearTask	()V
    //   48: bipush 100
    //   50: anewarray 12	com/tencent/mm/network/bj
    //   53: astore 5
    //   55: aload_0
    //   56: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   59: astore 6
    //   61: aload 6
    //   63: monitorenter
    //   64: iconst_0
    //   65: istore 7
    //   67: iload 7
    //   69: bipush 100
    //   71: if_icmpge +29 -> 100
    //   74: aload 5
    //   76: iload 7
    //   78: aload_0
    //   79: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   82: iload 7
    //   84: aaload
    //   85: aastore
    //   86: aload_0
    //   87: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   90: iload 7
    //   92: aconst_null
    //   93: aastore
    //   94: iinc 7 1
    //   97: goto -30 -> 67
    //   100: aload 6
    //   102: monitorexit
    //   103: iload 4
    //   105: bipush 100
    //   107: if_icmpge +97 -> 204
    //   110: aload 5
    //   112: iload 4
    //   114: aaload
    //   115: ifnull +75 -> 190
    //   118: ldc 35
    //   120: new 37	java/lang/StringBuilder
    //   123: dup
    //   124: ldc_w 291
    //   127: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: iload 4
    //   132: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   135: ldc_w 293
    //   138: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 5
    //   143: iload 4
    //   145: aaload
    //   146: getfield 20	com/tencent/mm/network/bj:dTY	Lcom/tencent/mm/network/ak;
    //   149: invokeinterface 33 1 0
    //   154: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 73	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload 5
    //   165: iload 4
    //   167: aaload
    //   168: getfield 80	com/tencent/mm/network/bj:dTZ	Lcom/tencent/mm/network/ac;
    //   171: iload 4
    //   173: iload_1
    //   174: iload_2
    //   175: aload_3
    //   176: aload 5
    //   178: iload 4
    //   180: aaload
    //   181: getfield 20	com/tencent/mm/network/bj:dTY	Lcom/tencent/mm/network/ak;
    //   184: aconst_null
    //   185: invokeinterface 251 7 0
    //   190: iinc 4 1
    //   193: goto -90 -> 103
    //   196: astore 8
    //   198: aload 6
    //   200: monitorexit
    //   201: aload 8
    //   203: athrow
    //   204: return
    //   205: astore 9
    //   207: goto -17 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   74	94	196	finally
    //   100	103	196	finally
    //   118	190	205	android/os/RemoteException
  }

  final int er(int paramInt)
  {
    int i;
    synchronized (this.dTX)
    {
      i = es(paramInt);
      if (-1 == i)
      {
        z.e("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "-1 == index");
        return 0;
      }
    }
    try
    {
      int j = this.dTX[i].dTY.tO().tQ();
      return j;
      localObject = finally;
      throw localObject;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  protected final void finalize()
  {
    reset();
    super.finalize();
  }

  final boolean req2Buf(int paramInt, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    int i;
    synchronized (this.dTX)
    {
      i = es(paramInt);
      if (-1 == i)
        return false;
    }
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.cH(this.dTX[i].dUa.tC());
      z.i("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "req2Buf cookie: %s", arrayOfObject);
      this.dTX[i].dTY.tN().fm(this.dTX[i].dUa.qL());
      this.dTX[i].dTY.tN().bk(this.dTX[i].dUa.oD());
      boolean bool2 = this.dTX[i].dTY.tN().a(this.dTX[i].dTY.getType(), this.dTX[i].dUa.qL(), this.dTX[i].dUa.tC(), 0);
      if (bool2)
        paramByteArrayOutputStream.write(this.dTX[i].dTY.tN().tH());
      for (bool1 = bool2; ; bool1 = bool2)
      {
        return bool1;
        localObject = finally;
        throw localObject;
        z.e("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "request to buffer using jni failed");
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        bool1 = false;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        boolean bool1 = false;
    }
  }

  // ERROR //
  public final void reset()
  {
    // Byte code:
    //   0: ldc 35
    //   2: ldc_w 335
    //   5: invokestatic 73	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: invokestatic 336	com/tencent/mm/network/Java2C:reset	()V
    //   11: aload_0
    //   12: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   15: astore_1
    //   16: aload_1
    //   17: monitorenter
    //   18: iconst_0
    //   19: istore_2
    //   20: iload_2
    //   21: bipush 100
    //   23: if_icmpge +74 -> 97
    //   26: aload_0
    //   27: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   30: iload_2
    //   31: aaload
    //   32: astore 4
    //   34: aload 4
    //   36: ifnull +55 -> 91
    //   39: ldc 35
    //   41: new 37	java/lang/StringBuilder
    //   44: dup
    //   45: ldc_w 291
    //   48: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: iload_2
    //   52: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   55: ldc_w 293
    //   58: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: aload_0
    //   62: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   65: iload_2
    //   66: aaload
    //   67: getfield 20	com/tencent/mm/network/bj:dTY	Lcom/tencent/mm/network/ak;
    //   70: invokeinterface 33 1 0
    //   75: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   78: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 73	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: aload_0
    //   85: getfield 14	com/tencent/mm/network/bi:dTX	[Lcom/tencent/mm/network/bj;
    //   88: iload_2
    //   89: aconst_null
    //   90: aastore
    //   91: iinc 2 1
    //   94: goto -74 -> 20
    //   97: aload_1
    //   98: monitorexit
    //   99: return
    //   100: astore_3
    //   101: aload_1
    //   102: monitorexit
    //   103: aload_3
    //   104: athrow
    //   105: astore 5
    //   107: goto -16 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   26	34	100	finally
    //   39	91	100	finally
    //   97	99	100	finally
    //   39	91	105	android/os/RemoteException
  }

  public final void stopTask(int paramInt)
  {
    z.i("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "stopTask netId=" + paramInt);
    if ((paramInt < 0) || (paramInt >= 100))
      return;
    synchronized (this.dTX)
    {
      bj localbj1 = this.dTX[paramInt];
      int i = 0;
      if (localbj1 != null)
        i = this.dTX[paramInt].dTY.hashCode();
      if (i != 0)
        Java2C.stopTask(i);
      synchronized (this.dTX)
      {
        bj localbj2 = this.dTX[paramInt];
        if (localbj2 == null);
      }
    }
    try
    {
      z.i("!44@/B4Tb64lLpJ+CRpvz/hRUCYP4tiH2KC7OoUzhxHmm0g=", "outQueue: netId=" + paramInt + ", type=" + this.dTX[paramInt].dTY.getType());
      this.dTX[paramInt] = null;
      label156: return;
      localObject2 = finally;
      throw localObject2;
      localObject1 = finally;
      throw localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      break label156;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bi
 * JD-Core Version:    0.6.2
 */
package com.tencent.map.location;

import android.telephony.PhoneStateListener;
import java.lang.reflect.Method;

public final class l extends PhoneStateListener
{
  private int KZ = 0;
  private int LL = 0;
  private int LM = -1;
  private int LN = 2147483647;
  private Method LO = null;
  private Method LP = null;
  private Method LQ = null;
  private Method LR = null;
  private Method LS = null;
  private int La = 0;
  private int a = 0;
  private int b = 0;
  private int g = 2147483647;

  public l(j paramj, int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramInt2;
  }

  // ERROR //
  public final void onCellLocationChanged(android.telephony.CellLocation paramCellLocation)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_m1
    //   2: putfield 40	com/tencent/map/location/l:LM	I
    //   5: aload_0
    //   6: iconst_m1
    //   7: putfield 38	com/tencent/map/location/l:LL	I
    //   10: aload_0
    //   11: iconst_m1
    //   12: putfield 36	com/tencent/map/location/l:La	I
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield 34	com/tencent/map/location/l:KZ	I
    //   20: aload_1
    //   21: ifnull +31 -> 52
    //   24: aload_0
    //   25: getfield 30	com/tencent/map/location/l:a	I
    //   28: tableswitch	default:+24 -> 52, 1:+108->136, 2:+263->291
    //   53: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   61: pop
    //   62: aload_2
    //   63: new 61	com/tencent/map/location/m
    //   66: dup
    //   67: aload_0
    //   68: getfield 30	com/tencent/map/location/l:a	I
    //   71: aload_0
    //   72: getfield 32	com/tencent/map/location/l:b	I
    //   75: aload_0
    //   76: getfield 34	com/tencent/map/location/l:KZ	I
    //   79: aload_0
    //   80: getfield 36	com/tencent/map/location/l:La	I
    //   83: aload_0
    //   84: getfield 38	com/tencent/map/location/l:LL	I
    //   87: aload_0
    //   88: getfield 40	com/tencent/map/location/l:LM	I
    //   91: aload_0
    //   92: getfield 43	com/tencent/map/location/l:g	I
    //   95: aload_0
    //   96: getfield 45	com/tencent/map/location/l:LN	I
    //   99: invokespecial 64	com/tencent/map/location/m:<init>	(IIIIIIII)V
    //   102: invokestatic 69	com/tencent/map/location/j:a	(Lcom/tencent/map/location/j;Lcom/tencent/map/location/m;)Lcom/tencent/map/location/m;
    //   105: pop
    //   106: aload_0
    //   107: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   110: invokestatic 72	com/tencent/map/location/j:a	(Lcom/tencent/map/location/j;)Lcom/tencent/map/location/n;
    //   113: ifnull +22 -> 135
    //   116: aload_0
    //   117: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   120: invokestatic 72	com/tencent/map/location/j:a	(Lcom/tencent/map/location/j;)Lcom/tencent/map/location/n;
    //   123: aload_0
    //   124: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   127: invokestatic 75	com/tencent/map/location/j:b	(Lcom/tencent/map/location/j;)Lcom/tencent/map/location/m;
    //   130: invokeinterface 80 2 0
    //   135: return
    //   136: aload_1
    //   137: checkcast 82	android/telephony/gsm/GsmCellLocation
    //   140: astore 7
    //   142: aload 7
    //   144: invokevirtual 86	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   147: ifgt +30 -> 177
    //   150: aload 7
    //   152: invokevirtual 89	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   155: ifgt +22 -> 177
    //   158: aload_0
    //   159: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   162: invokestatic 93	com/tencent/map/location/j:d	(Lcom/tencent/map/location/j;)Landroid/telephony/TelephonyManager;
    //   165: invokevirtual 99	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   168: checkcast 82	android/telephony/gsm/GsmCellLocation
    //   171: astore 12
    //   173: aload 12
    //   175: astore 7
    //   177: iconst_1
    //   178: istore 8
    //   180: iload 8
    //   182: ifeq -130 -> 52
    //   185: aload 7
    //   187: ifnull -135 -> 52
    //   190: aload_0
    //   191: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   194: invokestatic 93	com/tencent/map/location/j:d	(Lcom/tencent/map/location/j;)Landroid/telephony/TelephonyManager;
    //   197: invokevirtual 103	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   200: astore 9
    //   202: aload 9
    //   204: ifnull +28 -> 232
    //   207: aload 9
    //   209: invokevirtual 108	java/lang/String:length	()I
    //   212: iconst_3
    //   213: if_icmple +19 -> 232
    //   216: aload_0
    //   217: aload 9
    //   219: iconst_3
    //   220: invokevirtual 112	java/lang/String:substring	(I)Ljava/lang/String;
    //   223: invokestatic 118	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   226: invokevirtual 121	java/lang/Integer:intValue	()I
    //   229: putfield 34	com/tencent/map/location/l:KZ	I
    //   232: aload_0
    //   233: aload 7
    //   235: invokevirtual 86	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   238: putfield 36	com/tencent/map/location/l:La	I
    //   241: aload_0
    //   242: aload 7
    //   244: invokevirtual 89	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   247: putfield 38	com/tencent/map/location/l:LL	I
    //   250: aload_0
    //   251: getfield 25	com/tencent/map/location/l:LK	Lcom/tencent/map/location/j;
    //   254: invokestatic 125	com/tencent/map/location/j:c	(Lcom/tencent/map/location/j;)V
    //   257: goto -205 -> 52
    //   260: astore 6
    //   262: aconst_null
    //   263: astore 7
    //   265: iconst_0
    //   266: istore 8
    //   268: goto -88 -> 180
    //   271: astore 10
    //   273: aload_0
    //   274: iconst_m1
    //   275: putfield 38	com/tencent/map/location/l:LL	I
    //   278: aload_0
    //   279: iconst_m1
    //   280: putfield 36	com/tencent/map/location/l:La	I
    //   283: aload_0
    //   284: iconst_m1
    //   285: putfield 34	com/tencent/map/location/l:KZ	I
    //   288: goto -38 -> 250
    //   291: aload_1
    //   292: ifnull -240 -> 52
    //   295: aload_0
    //   296: getfield 47	com/tencent/map/location/l:LO	Ljava/lang/reflect/Method;
    //   299: ifnonnull +93 -> 392
    //   302: aload_0
    //   303: ldc 127
    //   305: invokestatic 133	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   308: ldc 135
    //   310: iconst_0
    //   311: anewarray 129	java/lang/Class
    //   314: invokevirtual 139	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   317: putfield 47	com/tencent/map/location/l:LO	Ljava/lang/reflect/Method;
    //   320: aload_0
    //   321: ldc 127
    //   323: invokestatic 133	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   326: ldc 141
    //   328: iconst_0
    //   329: anewarray 129	java/lang/Class
    //   332: invokevirtual 139	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   335: putfield 49	com/tencent/map/location/l:LP	Ljava/lang/reflect/Method;
    //   338: aload_0
    //   339: ldc 127
    //   341: invokestatic 133	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   344: ldc 143
    //   346: iconst_0
    //   347: anewarray 129	java/lang/Class
    //   350: invokevirtual 139	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   353: putfield 51	com/tencent/map/location/l:LQ	Ljava/lang/reflect/Method;
    //   356: aload_0
    //   357: ldc 127
    //   359: invokestatic 133	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   362: ldc 145
    //   364: iconst_0
    //   365: anewarray 129	java/lang/Class
    //   368: invokevirtual 139	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   371: putfield 53	com/tencent/map/location/l:LR	Ljava/lang/reflect/Method;
    //   374: aload_0
    //   375: ldc 127
    //   377: invokestatic 133	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   380: ldc 147
    //   382: iconst_0
    //   383: anewarray 129	java/lang/Class
    //   386: invokevirtual 139	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   389: putfield 55	com/tencent/map/location/l:LS	Ljava/lang/reflect/Method;
    //   392: aload_0
    //   393: aload_0
    //   394: getfield 49	com/tencent/map/location/l:LP	Ljava/lang/reflect/Method;
    //   397: aload_1
    //   398: iconst_0
    //   399: anewarray 149	java/lang/Object
    //   402: invokevirtual 155	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   405: checkcast 114	java/lang/Integer
    //   408: invokevirtual 121	java/lang/Integer:intValue	()I
    //   411: putfield 34	com/tencent/map/location/l:KZ	I
    //   414: aload_0
    //   415: aload_0
    //   416: getfield 51	com/tencent/map/location/l:LQ	Ljava/lang/reflect/Method;
    //   419: aload_1
    //   420: iconst_0
    //   421: anewarray 149	java/lang/Object
    //   424: invokevirtual 155	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   427: checkcast 114	java/lang/Integer
    //   430: invokevirtual 121	java/lang/Integer:intValue	()I
    //   433: putfield 36	com/tencent/map/location/l:La	I
    //   436: aload_0
    //   437: aload_0
    //   438: getfield 47	com/tencent/map/location/l:LO	Ljava/lang/reflect/Method;
    //   441: aload_1
    //   442: iconst_0
    //   443: anewarray 149	java/lang/Object
    //   446: invokevirtual 155	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   449: checkcast 114	java/lang/Integer
    //   452: invokevirtual 121	java/lang/Integer:intValue	()I
    //   455: putfield 38	com/tencent/map/location/l:LL	I
    //   458: aload_0
    //   459: aload_0
    //   460: getfield 53	com/tencent/map/location/l:LR	Ljava/lang/reflect/Method;
    //   463: aload_1
    //   464: iconst_0
    //   465: anewarray 149	java/lang/Object
    //   468: invokevirtual 155	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   471: checkcast 114	java/lang/Integer
    //   474: invokevirtual 121	java/lang/Integer:intValue	()I
    //   477: putfield 43	com/tencent/map/location/l:g	I
    //   480: aload_0
    //   481: aload_0
    //   482: getfield 55	com/tencent/map/location/l:LS	Ljava/lang/reflect/Method;
    //   485: aload_1
    //   486: iconst_0
    //   487: anewarray 149	java/lang/Object
    //   490: invokevirtual 155	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   493: checkcast 114	java/lang/Integer
    //   496: invokevirtual 121	java/lang/Integer:intValue	()I
    //   499: putfield 45	com/tencent/map/location/l:LN	I
    //   502: goto -450 -> 52
    //   505: astore 5
    //   507: aload_0
    //   508: iconst_m1
    //   509: putfield 38	com/tencent/map/location/l:LL	I
    //   512: aload_0
    //   513: iconst_m1
    //   514: putfield 36	com/tencent/map/location/l:La	I
    //   517: aload_0
    //   518: iconst_m1
    //   519: putfield 34	com/tencent/map/location/l:KZ	I
    //   522: aload_0
    //   523: ldc 41
    //   525: putfield 43	com/tencent/map/location/l:g	I
    //   528: aload_0
    //   529: ldc 41
    //   531: putfield 45	com/tencent/map/location/l:LN	I
    //   534: goto -482 -> 52
    //   537: astore 11
    //   539: goto -274 -> 265
    //
    // Exception table:
    //   from	to	target	type
    //   136	142	260	java/lang/Exception
    //   207	232	271	java/lang/Exception
    //   232	250	271	java/lang/Exception
    //   295	392	505	java/lang/Exception
    //   392	502	505	java/lang/Exception
    //   142	173	537	java/lang/Exception
  }

  public final void onSignalStrengthChanged(int paramInt)
  {
    if (this.a == 1)
      j.c(this.LK);
    if (Math.abs(paramInt - (113 + this.LM) / 2) > 3)
    {
      if (this.LM != -1)
        break label52;
      this.LM = (-113 + (paramInt << 1));
    }
    label52: 
    do
    {
      return;
      this.LM = (-113 + (paramInt << 1));
      j localj = this.LK;
      j.a(localj, new m(this.a, this.b, this.KZ, this.La, this.LL, this.LM, this.g, this.LN));
    }
    while (j.a(this.LK) == null);
    j.a(this.LK).a(j.b(this.LK));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.l
 * JD-Core Version:    0.6.2
 */
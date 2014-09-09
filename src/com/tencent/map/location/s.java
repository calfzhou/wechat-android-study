package com.tencent.map.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import com.tencent.map.a.a.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class s
  implements aa, d, n, r
{
  private static boolean LJ = false;
  private static s Me = null;
  private int KZ;
  private Context LB = null;
  private m LG = null;
  private byte[] LH = new byte[0];
  private byte[] LI = new byte[0];
  private j LK = null;
  private int LL;
  private int LM = 0;
  private int LN = 1;
  private q LW = null;
  private o LX = null;
  private g LZ = null;
  private int La;
  private c Ln = null;
  private boolean Lw = false;
  private String Lx = "";
  private f Ly = null;
  private long Lz = 5000L;
  private com.tencent.map.a.a.d MX = null;
  private String MY = "";
  private b Ma = null;
  private x Mb = null;
  private w Mc = null;
  private v Md = null;
  private long Mf = -1L;
  private z Mg = null;
  private com.tencent.map.a.a.d Mh = null;
  private String No = "";
  private String Nw = "";
  private boolean PG = false;
  private String Pf = "";
  private String Pm = "";
  private Handler QG = null;
  private Runnable QH = new t(this);
  private boolean Qx = false;
  private long Qy = 0L;
  private final BroadcastReceiver Uw = new u(this);
  private int a = 1024;
  private int b = 4;
  private int g = 0;

  private void G(boolean paramBoolean)
  {
    if ((this.LW != null) && (this.LW.gZ()))
    {
      Location localLocation = this.LW.ha();
      this.Mh = new com.tencent.map.a.a.d();
      this.Mh.KL = ab.a(localLocation.getLatitude(), 6);
      this.Mh.KM = ab.a(localLocation.getLongitude(), 6);
      this.Mh.KO = ab.a(localLocation.getAltitude(), 1);
      this.Mh.KP = ab.a(localLocation.getAccuracy(), 1);
      this.Mh.KQ = ab.a(localLocation.getSpeed(), 1);
      this.Mh.KR = ab.a(localLocation.getBearing(), 1);
      this.Mh.KN = 0;
      this.Mh.KG = false;
      if (paramBoolean)
        break label237;
    }
    label237: for (this.Mh.Lj = 0; ; this.Mh.Lj = 1)
    {
      this.Mh.Lk = 0;
      this.MX = new com.tencent.map.a.a.d(this.Mh);
      this.LM = 0;
      if ((System.currentTimeMillis() - this.Mf >= this.Lz) && (this.Ma != null) && (this.KZ == 1))
      {
        this.Ma.a(this.Mh);
        this.Mf = System.currentTimeMillis();
      }
      return;
    }
  }

  private void V(String paramString)
  {
    try
    {
      this.Mh = new com.tencent.map.a.a.d();
      JSONObject localJSONObject1 = new JSONObject(paramString);
      JSONObject localJSONObject2 = localJSONObject1.getJSONObject("location");
      this.Mh.KN = 1;
      this.Mh.KL = ab.a(localJSONObject2.getDouble("latitude"), 6);
      this.Mh.KM = ab.a(localJSONObject2.getDouble("longitude"), 6);
      this.Mh.KO = ab.a(localJSONObject2.getDouble("altitude"), 1);
      this.Mh.KP = ab.a(localJSONObject2.getDouble("accuracy"), 1);
      com.tencent.map.a.a.d locald1 = this.Mh;
      boolean bool;
      int i;
      int j;
      double d1;
      double d2;
      label238: int n;
      JSONObject localJSONObject4;
      if (this.LL == 1)
      {
        bool = true;
        locald1.KG = bool;
        String str = localJSONObject1.getString("bearing");
        i = -100;
        j = 0;
        if (str != null)
        {
          int k = str.split(",").length;
          j = 0;
          if (k > 1)
            j = Integer.parseInt(str.split(",")[1]);
        }
        if (this.LG != null)
          i = this.LG.LM;
        com.tencent.map.a.a.d locald2 = this.Mh;
        d1 = this.Mh.KP;
        if (j < 6)
          break label732;
        d2 = 40.0D;
        locald2.KP = d2;
        this.Mh.Lk = 0;
        if ((this.La == 1) && (this.LL == 1))
        {
          this.Mh.KH = localJSONObject2.getString("name");
          this.Mh.KT = localJSONObject2.getString("addr");
          this.Mh.Lk = 1;
        }
        if (((this.La == 3) || (this.La == 4)) && (this.LL == 1))
        {
          JSONObject localJSONObject5 = localJSONObject1.getJSONObject("details").getJSONObject("subnation");
          this.Mh.T(localJSONObject5.getString("name"));
          this.Mh.KW = localJSONObject5.getString("town");
          this.Mh.KX = localJSONObject5.getString("village");
          this.Mh.KY = localJSONObject5.getString("street");
          this.Mh.Lb = localJSONObject5.getString("street_no");
          this.Mh.Lk = 3;
          this.Mh.KS = 0;
        }
        if ((this.La == 4) && (this.LL == 1))
        {
          JSONArray localJSONArray = localJSONObject1.getJSONObject("details").getJSONArray("poilist");
          this.Mh.Li = a(localJSONArray);
          this.Mh.Lk = 4;
        }
        if ((this.La == 7) && (this.LL == 1))
        {
          JSONObject localJSONObject3 = localJSONObject1.getJSONObject("details");
          n = localJSONObject3.getInt("stat");
          localJSONObject4 = localJSONObject3.getJSONObject("subnation");
          if (n != 0)
            break label908;
          this.Mh.T(localJSONObject4.getString("name"));
          this.Mh.KW = localJSONObject4.getString("town");
          this.Mh.KX = localJSONObject4.getString("village");
          this.Mh.KY = localJSONObject4.getString("street");
          this.Mh.Lb = localJSONObject4.getString("street_no");
        }
      }
      while (true)
      {
        this.Mh.KS = n;
        this.Mh.Lk = 7;
        this.Mh.Lj = 0;
        this.MX = new com.tencent.map.a.a.d(this.Mh);
        this.LM = 0;
        if (this.Ly != null)
          this.Ly.U(paramString);
        if ((this.Ma != null) && (this.KZ == 1) && ((this.LW == null) || (!this.LW.gZ())))
        {
          this.Ma.a(this.Mh);
          this.Mf = System.currentTimeMillis();
        }
        return;
        bool = false;
        break;
        label732: if (j == 5)
        {
          d2 = 60.0D;
          break label238;
        }
        if (j == 4)
        {
          d2 = 70.0D;
          break label238;
        }
        if (j == 3)
        {
          d2 = 90.0D;
          break label238;
        }
        if (j == 2)
        {
          d2 = 110.0D;
          break label238;
        }
        int m;
        if ((i >= -72) && (j == 0))
          m = 10 * (int)(0.45D * d1 / 10.0D);
        while (true)
        {
          d2 = m;
          break;
          if (d1 <= 100.0D)
            m = 10 * (int)(1.0D + (d1 - 1.0D) / 10.0D);
          else if ((d1 > 100.0D) && (d1 <= 800.0D))
            m = 10 * (int)(0.85D * d1 / 10.0D);
          else
            m = 10 * (int)(0.8D * d1 / 10.0D);
        }
        label908: if (n == 1)
        {
          this.Mh.KU = localJSONObject4.getString("nation");
          this.Mh.Lc = localJSONObject4.getString("admin_level_1");
          this.Mh.Ld = localJSONObject4.getString("admin_level_2");
          this.Mh.Le = localJSONObject4.getString("admin_level_3");
          this.Mh.Lf = localJSONObject4.getString("locality");
          this.Mh.Lg = localJSONObject4.getString("sublocality");
          this.Mh.Lh = localJSONObject4.getString("route");
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.Mh = new com.tencent.map.a.a.d();
        this.Mh.Lk = -1;
        this.Mh.Lj = 2;
        this.LM = 2;
      }
    }
  }

  private static ArrayList a(JSONArray paramJSONArray)
  {
    int i = paramJSONArray.length();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
      localArrayList.add(new com.tencent.map.a.a.c(localJSONObject.getString("name"), localJSONObject.getString("addr"), localJSONObject.getString("catalog"), localJSONObject.getDouble("dist"), Double.parseDouble(localJSONObject.getString("latitude")), Double.parseDouble(localJSONObject.getString("longitude"))));
    }
    return localArrayList;
  }

  private void b()
  {
    if (this.Md != null)
      return;
    this.Md = new v(this, this.LW, this.LG, this.Mg);
    this.Md.start();
  }

  private void c()
  {
    this.Mh = new com.tencent.map.a.a.d();
    this.LM = 1;
    this.Mh.Lj = 1;
    this.Mh.Lk = -1;
    this.Mh.KN = 1;
    if ((this.Ma != null) && (this.KZ == 1))
      this.Ma.a(this.Mh);
  }

  public static s hb()
  {
    try
    {
      if (Me == null)
        Me = new s();
      s locals = Me;
      return locals;
    }
    finally
    {
    }
  }

  public final void a()
  {
    try
    {
      synchronized (this.LH)
      {
        if (this.Ma != null)
        {
          this.Ma = null;
          this.QG.removeCallbacks(this.QH);
          this.LB.unregisterReceiver(this.Uw);
          this.LX.a();
          this.LK.a();
          this.LZ.a();
        }
        label62: return;
      }
    }
    catch (Exception localException)
    {
      break label62;
    }
  }

  public final void a(double paramDouble1, double paramDouble2)
  {
    synchronized (this.LI)
    {
      Message localMessage = this.Mb.obtainMessage(6);
      Location localLocation = new Location("Deflect");
      localLocation.setLatitude(paramDouble1);
      localLocation.setLongitude(paramDouble2);
      localMessage.obj = localLocation;
      this.Mb.sendMessage(localMessage);
      return;
    }
  }

  public final void a(m paramm)
  {
    synchronized (this.LI)
    {
      Message localMessage = this.Mb.obtainMessage(2, paramm);
      this.Mb.sendMessage(localMessage);
      return;
    }
  }

  public final void a(q paramq)
  {
    synchronized (this.LI)
    {
      Message localMessage = this.Mb.obtainMessage(1, paramq);
      this.Mb.sendMessage(localMessage);
      return;
    }
  }

  public final void a(z paramz)
  {
    synchronized (this.LI)
    {
      Message localMessage = this.Mb.obtainMessage(3, paramz);
      this.Mb.sendMessage(localMessage);
      return;
    }
  }

  public final void aT(int paramInt)
  {
    synchronized (this.LI)
    {
      Message localMessage = this.Mb.obtainMessage(4, paramInt, 0);
      this.Mb.sendMessage(localMessage);
      return;
    }
  }

  public final void aU(int paramInt)
  {
    synchronized (this.LI)
    {
      Message localMessage = this.Mb.obtainMessage(5, paramInt, 0);
      this.Mb.sendMessage(localMessage);
      return;
    }
  }

  // ERROR //
  public final boolean b(Context paramContext, b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 110	com/tencent/map/location/s:LH	[B
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_1
    //   8: ifnull +7 -> 15
    //   11: aload_2
    //   12: ifnonnull +7 -> 19
    //   15: aload_3
    //   16: monitorexit
    //   17: iconst_0
    //   18: ireturn
    //   19: aload_0
    //   20: getfield 154	com/tencent/map/location/s:Pm	Ljava/lang/String;
    //   23: invokestatic 670	com/tencent/map/location/ab:a	(Ljava/lang/String;)Z
    //   26: ifne +7 -> 33
    //   29: aload_3
    //   30: monitorexit
    //   31: iconst_0
    //   32: ireturn
    //   33: aload_0
    //   34: new 632	com/tencent/map/location/x
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 671	com/tencent/map/location/x:<init>	(Lcom/tencent/map/location/s;)V
    //   42: putfield 116	com/tencent/map/location/s:Mb	Lcom/tencent/map/location/x;
    //   45: aload_0
    //   46: new 615	android/os/Handler
    //   49: dup
    //   50: invokestatic 677	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   53: invokespecial 680	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   56: putfield 162	com/tencent/map/location/s:QG	Landroid/os/Handler;
    //   59: aload_0
    //   60: aload_1
    //   61: putfield 92	com/tencent/map/location/s:LB	Landroid/content/Context;
    //   64: aload_0
    //   65: aload_2
    //   66: putfield 108	com/tencent/map/location/s:Ma	Lcom/tencent/map/a/a/b;
    //   69: invokestatic 686	com/tencent/map/location/af:hh	()Lcom/tencent/map/location/af;
    //   72: aload_0
    //   73: getfield 92	com/tencent/map/location/s:LB	Landroid/content/Context;
    //   76: invokevirtual 690	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   79: invokevirtual 693	com/tencent/map/location/af:a	(Landroid/content/Context;)V
    //   82: aload_1
    //   83: ldc_w 695
    //   86: invokevirtual 699	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   89: checkcast 701	android/net/ConnectivityManager
    //   92: astore 9
    //   94: aload 9
    //   96: ifnull +23 -> 119
    //   99: aload 9
    //   101: invokevirtual 705	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   104: ifnull +15 -> 119
    //   107: aload_0
    //   108: aload 9
    //   110: invokevirtual 705	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   113: invokevirtual 710	android/net/NetworkInfo:isRoaming	()Z
    //   116: putfield 156	com/tencent/map/location/s:PG	Z
    //   119: aload_0
    //   120: getfield 92	com/tencent/map/location/s:LB	Landroid/content/Context;
    //   123: aload_0
    //   124: getfield 174	com/tencent/map/location/s:Uw	Landroid/content/BroadcastReceiver;
    //   127: new 712	android/content/IntentFilter
    //   130: dup
    //   131: ldc_w 714
    //   134: invokespecial 715	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   137: invokevirtual 719	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   140: pop
    //   141: aload_0
    //   142: aload_0
    //   143: getfield 108	com/tencent/map/location/s:Ma	Lcom/tencent/map/a/a/b;
    //   146: invokevirtual 722	com/tencent/map/a/a/b:gS	()I
    //   149: putfield 267	com/tencent/map/location/s:KZ	I
    //   152: aload_0
    //   153: aload_0
    //   154: getfield 108	com/tencent/map/location/s:Ma	Lcom/tencent/map/a/a/b;
    //   157: invokevirtual 725	com/tencent/map/a/a/b:gT	()I
    //   160: putfield 326	com/tencent/map/location/s:La	I
    //   163: aload_0
    //   164: aload_0
    //   165: getfield 108	com/tencent/map/location/s:Ma	Lcom/tencent/map/a/a/b;
    //   168: invokevirtual 728	com/tencent/map/a/a/b:gU	()I
    //   171: putfield 299	com/tencent/map/location/s:LL	I
    //   174: aload_0
    //   175: ldc2_w 121
    //   178: putfield 124	com/tencent/map/location/s:Mf	J
    //   181: aload_0
    //   182: iconst_0
    //   183: putfield 158	com/tencent/map/location/s:Qx	Z
    //   186: aload_0
    //   187: iconst_1
    //   188: putfield 140	com/tencent/map/location/s:LN	I
    //   191: aload_0
    //   192: getfield 94	com/tencent/map/location/s:LX	Lcom/tencent/map/location/o;
    //   195: aload_0
    //   196: aload_0
    //   197: getfield 92	com/tencent/map/location/s:LB	Landroid/content/Context;
    //   200: invokevirtual 731	com/tencent/map/location/o:a	(Lcom/tencent/map/location/r;Landroid/content/Context;)Z
    //   203: istore 6
    //   205: aload_0
    //   206: getfield 96	com/tencent/map/location/s:LK	Lcom/tencent/map/location/j;
    //   209: aload_0
    //   210: getfield 92	com/tencent/map/location/s:LB	Landroid/content/Context;
    //   213: aload_0
    //   214: invokevirtual 734	com/tencent/map/location/j:a	(Landroid/content/Context;Lcom/tencent/map/location/n;)Z
    //   217: istore 7
    //   219: aload_0
    //   220: getfield 98	com/tencent/map/location/s:LZ	Lcom/tencent/map/location/g;
    //   223: aload_0
    //   224: getfield 92	com/tencent/map/location/s:LB	Landroid/content/Context;
    //   227: aload_0
    //   228: invokevirtual 737	com/tencent/map/location/g:a	(Landroid/content/Context;Lcom/tencent/map/location/aa;)Z
    //   231: istore 8
    //   233: aload_0
    //   234: invokestatic 741	com/tencent/map/location/f:gX	()Lcom/tencent/map/location/f;
    //   237: putfield 104	com/tencent/map/location/s:Ly	Lcom/tencent/map/location/f;
    //   240: aload_0
    //   241: invokestatic 745	com/tencent/map/location/c:gW	()Lcom/tencent/map/location/c;
    //   244: putfield 106	com/tencent/map/location/s:Ln	Lcom/tencent/map/location/c;
    //   247: aload_0
    //   248: aconst_null
    //   249: putfield 126	com/tencent/map/location/s:LW	Lcom/tencent/map/location/q;
    //   252: aload_0
    //   253: aconst_null
    //   254: putfield 128	com/tencent/map/location/s:LG	Lcom/tencent/map/location/m;
    //   257: aload_0
    //   258: aconst_null
    //   259: putfield 130	com/tencent/map/location/s:Mg	Lcom/tencent/map/location/z;
    //   262: aload_0
    //   263: aconst_null
    //   264: putfield 132	com/tencent/map/location/s:Mh	Lcom/tencent/map/a/a/d;
    //   267: aload_0
    //   268: aconst_null
    //   269: putfield 134	com/tencent/map/location/s:MX	Lcom/tencent/map/a/a/d;
    //   272: aload_0
    //   273: iconst_0
    //   274: putfield 136	com/tencent/map/location/s:LM	I
    //   277: aload_0
    //   278: getfield 104	com/tencent/map/location/s:Ly	Lcom/tencent/map/location/f;
    //   281: ifnull +10 -> 291
    //   284: aload_0
    //   285: getfield 104	com/tencent/map/location/s:Ly	Lcom/tencent/map/location/f;
    //   288: invokevirtual 746	com/tencent/map/location/f:a	()V
    //   291: aload_0
    //   292: iconst_1
    //   293: putfield 138	com/tencent/map/location/s:g	I
    //   296: iload 6
    //   298: ifeq +14 -> 312
    //   301: aload_0
    //   302: getfield 299	com/tencent/map/location/s:LL	I
    //   305: ifne +7 -> 312
    //   308: aload_3
    //   309: monitorexit
    //   310: iconst_1
    //   311: ireturn
    //   312: iload 7
    //   314: ifne +8 -> 322
    //   317: iload 8
    //   319: ifeq +7 -> 326
    //   322: aload_3
    //   323: monitorexit
    //   324: iconst_1
    //   325: ireturn
    //   326: aload_3
    //   327: monitorexit
    //   328: iconst_0
    //   329: ireturn
    //   330: astore 4
    //   332: aload_3
    //   333: monitorexit
    //   334: aload 4
    //   336: athrow
    //   337: astore 5
    //   339: goto -198 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   19	31	330	finally
    //   33	82	330	finally
    //   82	94	330	finally
    //   99	119	330	finally
    //   119	141	330	finally
    //   141	291	330	finally
    //   291	296	330	finally
    //   301	310	330	finally
    //   82	94	337	java/lang/Exception
    //   99	119	337	java/lang/Exception
    //   119	141	337	java/lang/Exception
  }

  public final void f(long paramLong)
  {
    if ((2000L >= 1000L) && (2000L <= 20000L))
      this.Lz = 2000L;
  }

  public final boolean h(String paramString1, String paramString2)
  {
    while (true)
    {
      int i;
      int i2;
      label385: int i16;
      int i17;
      int i6;
      synchronized (this.LH)
      {
        a locala = a.gV();
        if (!ab.a(paramString1))
        {
          i = 0;
          if (i != 0)
          {
            this.Pm = paramString1;
            return true;
          }
        }
        else
        {
          if (!ab.W(paramString2))
          {
            i = 0;
            continue;
          }
          int j = paramString1.length();
          int k = 0;
          int m = 0;
          if (k < j)
          {
            m += ab.g(paramString1.charAt(k));
            k++;
            continue;
          }
          int n = m ^ j + (j << 7);
          int i1 = 0x1F & 36 + (10 + n * 9) / 3;
          if (paramString2.charAt(4) != ab.Lx.charAt(i1))
          {
            i2 = 0;
            break label630;
          }
          int i10 = 0x1F & (11 + n * 5) / 5;
          if (paramString2.charAt(7) != ab.Lx.charAt(i10))
          {
            i2 = 0;
            break label630;
          }
          int i11 = 0x1F & (n + 10) / 3 << 3;
          if (paramString2.charAt(12) != ab.Lx.charAt(i11))
          {
            i2 = 0;
            break label630;
          }
          int i12 = 0x1F & (19 + n * 3) / 9;
          if (paramString2.charAt(14) != ab.Lx.charAt(i12))
          {
            i2 = 0;
            break label630;
          }
          int i13 = 0x1F & (39 + n * 3) / 8;
          if (paramString2.charAt(19) != ab.Lx.charAt(i13))
          {
            i2 = 0;
            break label630;
          }
          int i14 = 0x1F & (67 + n / 23) / 7;
          if (paramString2.charAt(21) != ab.Lx.charAt(i14))
          {
            i2 = 0;
            break label630;
          }
          int i15 = 0x1F & 7 * (3 + (n + 23) / 6);
          if (paramString2.charAt(26) == ab.Lx.charAt(i15))
            break label641;
          i2 = 0;
          break label630;
          if (i16 < paramString1.length())
          {
            i17 = 0xFF & i17 >> 8 ^ ab.Ys[(0xFF & (i17 ^ ab.g(paramString1.charAt(i16))))];
            i16++;
            continue;
          }
          int i18 = i17 & 0x1F;
          if (paramString2.charAt(0) != ab.Lx.charAt(i18))
          {
            i2 = 0;
            break label630;
          }
          int i19 = 0x1F & i17 >> 5;
          if (paramString2.charAt(1) == ab.Lx.charAt(i19))
            break label650;
          i2 = 0;
          break label630;
          if (i3 < 27)
          {
            i4 = 0xFF & i4 >> 8 ^ ab.Ys[(0xFF & (i4 ^ ab.g(paramString2.charAt(i3))))];
            i3++;
            continue;
          }
          int i5 = i4 & 0x1F;
          if (paramString2.charAt(27) != ab.Lx.charAt(i5))
          {
            i6 = 0;
            break label665;
          }
          int i7 = 0x1F & i4 >> 5;
          int i8 = paramString2.charAt(28);
          int i9 = ab.Lx.charAt(i7);
          if (i8 != i9)
          {
            i6 = 0;
            break label665;
          }
          i6 = 1;
          break label665;
          i = 1;
          continue;
        }
        return false;
      }
      while (true)
      {
        label630: if (i2 != 0)
          break label656;
        i = 0;
        break;
        label641: i16 = 0;
        i17 = 0;
        break label385;
        label650: i2 = 1;
      }
      label656: int i3 = 0;
      int i4 = 0;
      continue;
      label665: if (i6 == 0)
        i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.s
 * JD-Core Version:    0.6.2
 */
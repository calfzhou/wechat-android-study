package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ak.t;
import com.tencent.mm.h;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.chat.bd;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.cb;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import junit.framework.Assert;

public final class fn extends cb
  implements t, com.tencent.mm.o.m
{
  private static String jpZ;
  static long jqC = 0L;
  private static Map jqF;
  private static HashMap jqL = new HashMap();
  protected String cEh;
  private int cKo;
  protected String dnT;
  private int eeP;
  protected View.OnCreateContextMenuListener fPK;
  protected com.tencent.mm.pluginsdk.ui.g fPh;
  private short[] fpP;
  private LayoutInflater fpT;
  private boolean hMJ;
  protected hd jmH;
  protected af joi;
  private short[] jpU;
  public long jpV = -1L;
  private int jpW;
  private HashSet jpX = new HashSet();
  protected final oj jpY;
  private boolean jqA = false;
  private TreeSet jqB;
  private Map jqD;
  private Map jqE;
  private HashMap jqG = new HashMap();
  ar jqH;
  private boolean jqI;
  private boolean jqJ;
  private View.OnClickListener jqK;
  private long jqM;
  private final int jqa;
  private final int jqb;
  protected fu jqc;
  private fu jqd;
  protected gk jqe;
  private gk jqf;
  protected gb jqg;
  private gb jqh;
  protected bd jqi;
  private bd jqj;
  protected fs jqk;
  private fs jql;
  protected u jqm;
  private u jqn;
  private View.OnCreateContextMenuListener jqo;
  protected View.OnClickListener jqp;
  private cm jqq;
  private long jqr = -1L;
  private long jqs = -1L;
  private long jqt = -1L;
  private int jqu = 0;
  private int jqv = 0;
  private boolean jqw = false;
  private boolean jqx = false;
  private boolean jqy = false;
  private boolean jqz = false;

  static
  {
    HashMap localHashMap = new HashMap();
    jqF = localHashMap;
    localHashMap.put("T49S", Integer.valueOf(19));
    jqF.put("T49R", Integer.valueOf(18));
    jqF.put("T268435505S", Integer.valueOf(21));
    jqF.put("T268435505R", Integer.valueOf(20));
    jqF.put("T1048625S", Integer.valueOf(30));
    jqF.put("T1048625R", Integer.valueOf(29));
    jqF.put("T369098801S", Integer.valueOf(47));
    jqF.put("T369098801R", Integer.valueOf(46));
    jqF.put("T335544369S", Integer.valueOf(42));
    jqF.put("T335544369R", Integer.valueOf(41));
    jqF.put("T402653233S", Integer.valueOf(45));
    jqF.put("T402653233R", Integer.valueOf(44));
    jqF.put("T16777265S", Integer.valueOf(23));
    jqF.put("T16777265R", Integer.valueOf(22));
    jqF.put("T10000R", Integer.valueOf(5));
    jqF.put("T39S", Integer.valueOf(3));
    jqF.put("T39R", Integer.valueOf(1));
    jqF.put("T3S", Integer.valueOf(3));
    jqF.put("T3R", Integer.valueOf(1));
    jqF.put("T23S", Integer.valueOf(3));
    jqF.put("T23R", Integer.valueOf(1));
    jqF.put("T47S", Integer.valueOf(15));
    jqF.put("T47R", Integer.valueOf(14));
    jqF.put("T34S", Integer.valueOf(7));
    jqF.put("T34R", Integer.valueOf(6));
    jqF.put("T35R", Integer.valueOf(8));
    jqF.put("T42S", Integer.valueOf(13));
    jqF.put("T42R", Integer.valueOf(12));
    jqF.put("T37R", Integer.valueOf(9));
    jqF.put("T40R", Integer.valueOf(9));
    jqF.put("T43S", Integer.valueOf(11));
    jqF.put("T43R", Integer.valueOf(10));
    jqF.put("T48S", Integer.valueOf(17));
    jqF.put("T48R", Integer.valueOf(16));
    jqF.put("T52R", Integer.valueOf(25));
    jqF.put("T50R", Integer.valueOf(24));
    jqF.put("T50S", Integer.valueOf(43));
    jqF.put("T285212721R", Integer.valueOf(26));
    jqF.put("T301989937S", Integer.valueOf(32));
    jqF.put("T301989937R", Integer.valueOf(31));
    jqF.put("T1S", Integer.valueOf(4));
    jqF.put("T1R", Integer.valueOf(2));
    jqF.put("T11S", Integer.valueOf(4));
    jqF.put("T11R", Integer.valueOf(2));
    jqF.put("T13S", Integer.valueOf(3));
    jqF.put("T13R", Integer.valueOf(1));
    jqF.put("T21S", Integer.valueOf(4));
    jqF.put("T21R", Integer.valueOf(2));
    jqF.put("T31S", Integer.valueOf(4));
    jqF.put("T31R", Integer.valueOf(2));
    jqF.put("T36S", Integer.valueOf(4));
    jqF.put("T36R", Integer.valueOf(2));
    jqF.put("T53R", Integer.valueOf(27));
    jqF.put("T53S", Integer.valueOf(28));
    jqF.put("T55R", Integer.valueOf(36));
    jqF.put("T55S", Integer.valueOf(37));
    jqF.put("T57R", Integer.valueOf(36));
    jqF.put("T57S", Integer.valueOf(37));
    jqF.put("T-1879048191R", Integer.valueOf(33));
    jqF.put("T-1879048189R", Integer.valueOf(34));
    jqF.put("T-1879048190R", Integer.valueOf(35));
    jqF.put("T-1879048188R", Integer.valueOf(38));
    jqF.put("T-1879048187R", Integer.valueOf(39));
    jqF.put("T318767153R", Integer.valueOf(40));
    jqF.put("T318767153R", Integer.valueOf(40));
    jqF.put("T-1879048186R", Integer.valueOf(48));
    jqF.put("T-1879048186S", Integer.valueOf(49));
    jqF.put("T-1879048185R", Integer.valueOf(52));
    jqF.put("T-1879048185S", Integer.valueOf(52));
    jqF.put("T419430449R", Integer.valueOf(53));
    jqF.put("T419430449S", Integer.valueOf(54));
    jqF.put("T62R", Integer.valueOf(55));
    jqF.put("T62S", Integer.valueOf(56));
  }

  public fn(hd paramhd, ar paramar, String paramString1, String paramString2, af paramaf, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    super(paramhd.agh(), paramar);
    this.jqG.put(Integer.valueOf(19), new dc(19));
    this.jqG.put(Integer.valueOf(18), new cp(18));
    this.jqG.put(Integer.valueOf(21), new df());
    this.jqG.put(Integer.valueOf(20), new cq());
    this.jqG.put(Integer.valueOf(23), new cz());
    this.jqG.put(Integer.valueOf(22), new cy());
    this.jqG.put(Integer.valueOf(30), new co());
    this.jqG.put(Integer.valueOf(29), new cn());
    this.jqG.put(Integer.valueOf(47), new dc(47));
    this.jqG.put(Integer.valueOf(46), new cp(46));
    this.jqG.put(Integer.valueOf(42), new dc(42));
    this.jqG.put(Integer.valueOf(41), new cp(41));
    this.jqG.put(Integer.valueOf(45), new dc(45));
    this.jqG.put(Integer.valueOf(44), new cp(44));
    this.jqG.put(Integer.valueOf(5), new eg());
    this.jqG.put(Integer.valueOf(3), new dx());
    this.jqG.put(Integer.valueOf(1), new dw());
    this.jqG.put(Integer.valueOf(15), new ds());
    this.jqG.put(Integer.valueOf(14), new dr());
    this.jqG.put(Integer.valueOf(7), new fb());
    this.jqG.put(Integer.valueOf(6), new em());
    this.jqG.put(Integer.valueOf(8), new ea());
    this.jqG.put(Integer.valueOf(13), new dl());
    this.jqG.put(Integer.valueOf(12), new dk());
    this.jqG.put(Integer.valueOf(9), new dt());
    this.jqG.put(Integer.valueOf(11), new el());
    this.jqG.put(Integer.valueOf(10), new ek());
    this.jqG.put(Integer.valueOf(17), new dz());
    this.jqG.put(Integer.valueOf(16), new dy());
    this.jqG.put(Integer.valueOf(25), new fi());
    this.jqG.put(Integer.valueOf(24), new ff());
    this.jqG.put(Integer.valueOf(43), new fj());
    this.jqG.put(Integer.valueOf(4), new ej(4));
    this.jqG.put(Integer.valueOf(2), new ei(2));
    this.jqG.put(Integer.valueOf(26), new dj());
    this.jqG.put(Integer.valueOf(27), new fg());
    this.jqG.put(Integer.valueOf(28), new fh());
    this.jqG.put(Integer.valueOf(31), new ei(2));
    this.jqG.put(Integer.valueOf(32), new ej(4));
    this.jqG.put(Integer.valueOf(33), new ez());
    this.jqG.put(Integer.valueOf(34), new eo());
    this.jqG.put(Integer.valueOf(35), new ew());
    this.jqG.put(Integer.valueOf(36), new eb());
    this.jqG.put(Integer.valueOf(37), new ec());
    this.jqG.put(Integer.valueOf(38), new fm());
    this.jqG.put(Integer.valueOf(39), new fl());
    this.jqG.put(Integer.valueOf(40), new dn());
    this.jqG.put(Integer.valueOf(48), new cs());
    this.jqG.put(Integer.valueOf(49), new ct());
    this.jqG.put(Integer.valueOf(52), new du());
    this.jqG.put(Integer.valueOf(54), new cv());
    this.jqG.put(Integer.valueOf(53), new cu());
    this.jqG.put(Integer.valueOf(56), new ef());
    this.jqG.put(Integer.valueOf(55), new ee());
    this.jqH = new ar();
    this.jqI = false;
    this.jqJ = false;
    this.jqK = null;
    this.fPh = null;
    this.hMJ = false;
    this.jqM = 0L;
    jqC = 0L;
    this.jmH = paramhd;
    this.cKo = 211;
    this.jqa = paramhd.getResources().getDimensionPixelSize(com.tencent.mm.g.PQ);
    this.jqb = paramhd.getResources().getDimensionPixelSize(com.tencent.mm.g.PD);
    this.jpY = new oj(paramhd.agh(), new fo(this, paramhd), new fp(this));
    this.jqo = paramOnCreateContextMenuListener;
    this.fPK = paramOnCreateContextMenuListener;
    gk localgk = new gk(paramOnCreateContextMenuListener, paramhd);
    this.jqf = localgk;
    this.jqe = localgk;
    gb localgb = new gb(paramhd);
    this.jqh = localgb;
    this.jqg = localgb;
    bd localbd = new bd(paramhd.agh());
    this.jqj = localbd;
    this.jqi = localbd;
    fs localfs = new fs(this);
    this.jql = localfs;
    this.jqk = localfs;
    u localu = new u(paramhd);
    this.jqn = localu;
    this.jqm = localu;
    this.jqp = new gz(paramhd);
    Iterator localIterator = this.jqG.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      ((cj)this.jqG.get(localInteger)).iWI = paramhd.iWI;
    }
    this.fpT = com.tencent.mm.ui.ek.ck(paramhd.agh());
    a(paramString1, paramaf, paramString2);
    this.jqD = new HashMap();
    this.jqE = new HashMap();
  }

  private static short I(ar paramar)
  {
    int i = 1;
    int j;
    Map localMap2;
    StringBuilder localStringBuilder2;
    if (paramar.jK() == i)
    {
      j = i;
      if (paramar.getType() != 49)
        break label168;
      String str2 = ch.xw(paramar.getContent());
      int i2 = 0;
      if (str2 != null)
      {
        com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str2, paramar.ku());
        i2 = 0;
        if (localb != null)
        {
          int i3 = localb.type;
          i2 = 0;
          if (i3 == 2000)
          {
            paramar.setType(419430449);
            bg.qW().oV().a(paramar.kk(), paramar);
            i2 = i;
          }
        }
      }
      if (i2 == 0)
        break label168;
      localMap2 = jqF;
      localStringBuilder2 = new StringBuilder("T419430449");
      if (j == 0)
        break label160;
    }
    label160: for (String str3 = "S"; ; str3 = "R")
    {
      return (short)ap.a((Integer)localMap2.get(str3));
      j = 0;
      break;
    }
    label168: Map localMap1 = jqF;
    StringBuilder localStringBuilder1 = new StringBuilder("T").append(paramar.getType());
    if (j != 0);
    for (String str1 = "S"; ; str1 = "R")
    {
      int k = ap.a((Integer)localMap1.get(str1));
      if (k <= 0)
        break;
      return (short)k;
    }
    boolean bool1 = paramar.aJA();
    boolean bool2 = paramar.aJw();
    if (bool1)
    {
      if (j != 0)
        i = 3;
      return (short)i;
    }
    if (bool2)
    {
      if (j != 0);
      for (int i1 = 7; ; i1 = 6)
        return (short)i1;
    }
    if (paramar.aJF())
    {
      if (j != 0);
      for (int n = 15; ; n = 14)
        return (short)n;
    }
    if (j != 0);
    for (int m = 4; ; m = 2)
      return (short)m;
  }

  private static ar a(ar paramar, Cursor paramCursor)
  {
    if (paramar == null)
      paramar = new ar();
    paramar.b(paramCursor);
    return paramar;
  }

  private void aVa()
  {
    z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "disable clickListener");
    this.jqc = null;
    this.jqe = null;
    this.jqg = null;
    this.jqi = null;
    this.jqk = null;
    this.jqm = null;
  }

  public final boolean Cj(String paramString)
  {
    try
    {
      this.fPh = new com.tencent.mm.pluginsdk.ui.g(ap.b(new FileInputStream(paramString)));
      return true;
    }
    catch (Exception localException)
    {
      this.fPh = null;
    }
    return false;
  }

  public final void DW()
  {
    Cursor localCursor;
    if (!this.jqy)
    {
      this.eeP = bg.qW().oV().zF(this.cEh);
      Object[] arrayOfObject4 = new Object[3];
      arrayOfObject4[0] = Integer.valueOf(this.jpW);
      arrayOfObject4[1] = Integer.valueOf(this.eeP);
      arrayOfObject4[2] = this.cEh;
      z.i("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "resetCursor fromCount:%d  count:%d  talker:%s", arrayOfObject4);
      if (this.jpW < 0)
        this.jpW = (-18 + this.eeP);
      localCursor = bg.qW().oV().ak(this.cEh, this.jpW);
      if ((localCursor == null) || (localCursor.isClosed()))
      {
        z.w("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "update pos fail, cursor is null");
        setCursor(localCursor);
      }
    }
    while (true)
    {
      int i = getCount();
      if (i > 0)
      {
        this.jpU = new short[i];
        this.fpP = new short[i];
      }
      this.jqD.clear();
      this.jqE.clear();
      super.notifyDataSetChanged();
      return;
      if (localCursor.moveToFirst())
      {
        this.jqH = a(this.jqH, localCursor);
        this.jqr = this.jqH.kn();
      }
      ar localar1;
      if (this.jqH.jK() != 1)
      {
        int j = 0x4 & this.jqH.ky();
        localar1 = null;
        if (j != 4);
      }
      else
      {
        localar1 = this.jqH;
      }
      ar localar2 = new ar();
      Object localObject = localar1;
      for (ar localar3 = localar2; localCursor.moveToNext(); localar3 = null)
      {
        label276: localar3 = a(localar3, localCursor);
        if ((localar3.jK() != 1) && ((0x4 & localar3.ky()) != 4))
          break label276;
        localObject = localar3;
      }
      if ((localObject != null) && ((0x4 & ((ar)localObject).ky()) != 4))
        if (((ar)localObject).jK() != 1);
      for (jqC = ((ar)localObject).kk(); ; jqC = 0L)
      {
        if (localCursor.moveToLast())
        {
          this.jqH = a(this.jqH, localCursor);
          this.jqs = this.jqH.kn();
        }
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = Long.valueOf(this.jqr);
        arrayOfObject5[1] = Long.valueOf(this.jqs);
        z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "update pos topCreateTime[%d] downCreateTime[%d]", arrayOfObject5);
        break;
      }
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(this.jqw);
      arrayOfObject1[1] = Boolean.valueOf(this.jqx);
      z.i("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "topLoadMore[%B] downLoadMore[%B]", arrayOfObject1);
      if ((!this.jqw) && (!this.jqx) && (this.jqs >= this.jqt))
      {
        this.jqt = bg.qW().oV().zL(this.cEh);
        this.jqv = Math.max(0, -1 + bg.qW().oV().a(this.cEh, this.jqs, this.jqt));
        this.jqs = this.jqt;
      }
      if (this.jqw)
      {
        this.jqw = false;
        long l2 = bg.qW().oV().u(this.cEh, this.jqr);
        this.jqu = Math.max(0, -1 + bg.qW().oV().a(this.cEh, l2, this.jqr));
        this.jqr = l2;
      }
      if (this.jqx)
      {
        this.jqx = false;
        long l1 = bg.qW().oV().v(this.cEh, this.jqs);
        this.jqv = Math.max(0, -1 + bg.qW().oV().a(this.cEh, this.jqs, l1));
        this.jqs = l1;
      }
      Object[] arrayOfObject2 = new Object[5];
      arrayOfObject2[0] = Long.valueOf(this.jqr);
      arrayOfObject2[1] = Long.valueOf(this.jqs);
      arrayOfObject2[2] = Long.valueOf(this.jqt);
      arrayOfObject2[3] = Integer.valueOf(this.jqu);
      arrayOfObject2[4] = Integer.valueOf(this.jqv);
      z.v("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "query topCreateTime[%d] downCreateTime[%d], lastCreateTime[%d], topInc[%d], bottomInc[%d]", arrayOfObject2);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(bg.qW().oV().a(this.cEh, this.jqr, this.jqs));
      z.v("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "count([top, down]) = %d", arrayOfObject3);
      setCursor(bg.qW().oV().b(this.cEh, this.jqr, this.jqs));
    }
  }

  protected final void DX()
  {
    setCursor(bg.qW().oV().aIA());
  }

  public final void RR()
  {
    this.jqz = false;
    notifyDataSetChanged();
    z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "enable ClickListener");
    this.jqc = this.jqd;
    this.jqe = this.jqf;
    this.jqg = this.jqh;
    this.jqi = this.jqj;
    this.jqk = this.jql;
    this.jqm = this.jqn;
  }

  public final int Us()
  {
    return this.eeP;
  }

  public final int YZ()
  {
    return qg(18);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (this.jqq != null)
      this.jqq.post(new fr(this));
  }

  public final void a(long paramLong, ar paramar, boolean paramBoolean)
  {
    if ((!this.jqD.containsKey(Long.valueOf(paramLong))) || (!this.jqE.containsKey(Long.valueOf(paramLong))))
    {
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "msg not display, " + paramLong);
      return;
    }
    ck localck = (ck)((View)this.jqD.get(Long.valueOf(paramLong))).getTag();
    if (((Integer)this.jqE.get(Long.valueOf(paramLong))).intValue() == 1);
    for (boolean bool = true; ; bool = false)
    {
      dw localdw = (dw)w(3, bool);
      if (localdw == null)
        break;
      localdw.a(localck, paramar, paramBoolean);
      return;
    }
  }

  public final void a(String paramString, ao paramao)
  {
    if (this.jqI)
    {
      this.jqJ = true;
      z.i("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "klem notifyChanged locked, notify later");
      return;
    }
    super.a(paramString, paramao);
  }

  public final void a(String paramString1, af paramaf, String paramString2)
  {
    this.jqB = new TreeSet();
    jpZ = paramString1;
    if (i.yc(paramString1));
    for (this.dnT = i.ye(paramString2); ; this.dnT = paramString2)
    {
      this.joi = paramaf;
      fu localfu = new fu(this.jmH, paramString1, paramaf);
      this.jqd = localfu;
      this.jqc = localfu;
      this.cEh = paramString1;
      aRo();
      return;
    }
  }

  public final void aRo()
  {
    if (this.jqB != null)
      this.jqB.clear();
    this.eeP = 0;
    this.jpW = -1;
    this.jqr = -1L;
    this.jqs = -1L;
    this.jqt = -1L;
    this.jpV = -1L;
    this.jqu = 0;
    this.jqv = 0;
    this.jqw = false;
    this.jqx = false;
    this.jqy = false;
    this.jqz = false;
  }

  public final void aUT()
  {
    this.jqw = true;
  }

  public final void aUU()
  {
    this.jqx = true;
  }

  public final boolean aUV()
  {
    if (this.jqy)
    {
      this.jqt = bg.qW().oV().zL(this.cEh);
      if (this.jqt >= this.jqs)
      {
        this.jqs = this.jqt;
        DW();
        return true;
      }
    }
    return false;
  }

  public final boolean aUW()
  {
    if (!this.jqy)
      if (this.jpW > 0);
    long l;
    do
    {
      return true;
      return false;
      l = bg.qW().oV().zK(this.cEh);
    }
    while (this.jqr <= l);
    return false;
  }

  public final boolean aUX()
  {
    if (!this.jqy);
    long l;
    do
    {
      return true;
      l = bg.qW().oV().zL(this.cEh);
    }
    while (this.jqs >= l);
    return false;
  }

  public final Set aUY()
  {
    return this.jqB;
  }

  public final void aUZ()
  {
    this.jqB.clear();
  }

  public final void aVb()
  {
    this.jqz = true;
    notifyDataSetChanged();
    aVa();
  }

  public final void aVc()
  {
    this.jqA = true;
    aVa();
  }

  public final int acU()
  {
    return this.jqB.size();
  }

  public final boolean az(Context paramContext, String paramString)
  {
    if (jqL.containsKey(paramString))
    {
      this.fPh = ((com.tencent.mm.pluginsdk.ui.g)jqL.get(paramString));
      return true;
    }
    try
    {
      this.fPh = new com.tencent.mm.pluginsdk.ui.g(ap.b(paramContext.getAssets().open(paramString)));
      jqL.put(paramString, this.fPh);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final void c(cm paramcm)
  {
    this.jqq = paramcm;
  }

  public final boolean de(long paramLong)
  {
    if (this.jqB.contains(Long.valueOf(paramLong)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(paramLong);
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "remove select item, msgId = %d", arrayOfObject2);
      this.jqB.remove(Long.valueOf(paramLong));
    }
    while (true)
    {
      a(null, null);
      return true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(paramLong);
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "add select item, msgId = %d", arrayOfObject1);
      if (this.jqB.size() >= 100)
      {
        e.o(this.jmH.agh(), this.jmH.getString(n.bFZ), "");
        return false;
      }
      this.jqB.add(Long.valueOf(paramLong));
    }
  }

  public final void eX(String paramString)
  {
    a(null, null);
  }

  public final int f(long paramLong, boolean paramBoolean)
  {
    ar localar = bg.qW().oV().cV(paramLong);
    if (localar.kk() != paramLong)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Long.valueOf(paramLong);
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "get msg info by id %d error", arrayOfObject4);
      return 0;
    }
    long l = localar.kn();
    int j;
    if ((l < this.jqr) || (l > this.jqs))
    {
      this.jqr = l;
      this.jqt = bg.qW().oV().zL(this.cEh);
      if (paramBoolean)
      {
        this.jqs = this.jqt;
        this.jqy = true;
        int i = bg.qW().oV().a(this.cEh, this.jqr, this.jqs);
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(i);
        z.v("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "reset position, reload count %d", arrayOfObject1);
        if (i >= 18)
          break label366;
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Long.valueOf(this.jqr);
        arrayOfObject3[1] = Integer.valueOf(0);
        z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d", arrayOfObject3);
        this.jqr = bg.qW().oV().u(this.cEh, this.jqr);
        j = bg.qW().oV().a(this.cEh, this.jqr, l);
      }
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[5];
      arrayOfObject2[0] = Long.valueOf(paramLong);
      arrayOfObject2[1] = Long.valueOf(this.jqr);
      arrayOfObject2[2] = Long.valueOf(this.jqs);
      arrayOfObject2[3] = Long.valueOf(this.jqt);
      arrayOfObject2[4] = Integer.valueOf(j);
      z.v("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "set local message id, id[%d] top create time[%d] bottom create time[%d] last create time[%d] selection[%d]", arrayOfObject2);
      return j;
      this.jqs = bg.qW().oV().v(this.cEh, l);
      break;
      j = bg.qW().oV().a(this.cEh, this.jqr, l);
      continue;
      label366: j = 0;
    }
  }

  public final void f(long paramLong, int paramInt1, int paramInt2)
  {
    if ((!this.jqD.containsKey(Long.valueOf(paramLong))) || (!this.jqE.containsKey(Long.valueOf(paramLong))))
    {
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "msg not display, " + paramLong);
      return;
    }
    ck localck = (ck)((View)this.jqD.get(Long.valueOf(paramLong))).getTag();
    if (((Integer)this.jqE.get(Long.valueOf(paramLong))).intValue() == 1);
    for (boolean bool = true; ; bool = false)
    {
      w(3, bool);
      dx.a(localck, paramInt1, paramInt2);
      return;
    }
  }

  public final void fk(boolean paramBoolean)
  {
    this.jqI = paramBoolean;
    if (paramBoolean)
      this.jqJ = false;
    while (!this.jqJ)
      return;
    a(null, null);
  }

  public final void g(long paramLong, boolean paramBoolean)
  {
    if ((!this.jqD.containsKey(Long.valueOf(paramLong))) || (!this.jqE.containsKey(Long.valueOf(paramLong))))
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "msg not display, " + paramLong);
    while (true)
    {
      return;
      ck localck = (ck)((View)this.jqD.get(Long.valueOf(paramLong))).getTag();
      if (((Integer)this.jqE.get(Long.valueOf(paramLong))).intValue() == 1);
      for (boolean bool = true; ((dx)w(3, bool) != null) && (paramBoolean == true); bool = false)
      {
        mr localmr = (mr)localck;
        localmr.fIh.setVisibility(4);
        localmr.juT.setVisibility(4);
        localmr.juV.setVisibility(4);
        return;
      }
    }
  }

  public final int getItemViewType(int paramInt)
  {
    return I((ar)getItem(paramInt));
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ar localar1 = (ar)getItem(paramInt);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Integer.valueOf(localar1.getType());
    arrayOfObject[2] = Integer.valueOf(localar1.jK());
    arrayOfObject[3] = localar1.kt();
    z.i("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "shwen getview:%d, type:%d, send:%d, talker:%s", arrayOfObject);
    ar localar2;
    long l3;
    long l4;
    int i2;
    if ((paramInt != 0) && ((this.fpP[paramInt] == 0) || (this.jpU[(paramInt - 1)] == 0)))
    {
      localar2 = (ar)getItem(paramInt - 1);
      l3 = localar2.kn();
      l4 = localar1.kn();
      if (l4 - l3 >= 60000L)
        break label1023;
      i2 = 1;
    }
    while (true)
    {
      int i3;
      label150: label167: int i;
      label227: int j;
      label243: boolean bool1;
      label262: ck localck;
      int m;
      label382: boolean bool2;
      label427: label449: cj localcj2;
      if ((l4 - l3) / 180000L < 1L)
      {
        i3 = 1;
        if ((i2 == 0) && (i3 == 0))
          break label1035;
        this.fpP[paramInt] = 2;
        this.jpU[(paramInt - 1)] = I(localar2);
        if (((this.fpP[paramInt] != 1) && (paramInt != 0) && (!this.jpX.contains(Long.valueOf(localar1.kk())))) || (localar1.kn() <= 1000L))
          break label1045;
        i = 1;
        if (localar1.kk() != this.jpV)
          break label1051;
        j = 1;
        int k = localar1.getType();
        if (localar1.jK() != 1)
          break label1057;
        bool1 = true;
        cj localcj1 = w(k, bool1);
        if (localcj1 != null)
          this.jpU[paramInt] = ((short)localcj1.aUP());
        if ((localcj1 == null) && (paramView == null))
          z.e("!44@/B4Tb64lLpKwUcOR+EdWcneQ/T7gWCkZfvAB6P8J18g=", "inflating fail, item & convertView both are null, msgtype = " + localar1.getType() + ", isSend = " + localar1.jK());
        if (paramView == null)
          paramView = localcj1.a(this.fpT, paramView);
        localck = (ck)paramView.getTag();
        Assert.assertNotNull(paramView);
        Assert.assertNotNull(localck);
        if (!this.jqz)
          break label1063;
        m = 1;
        localck.joD = m;
        if (i == 0)
          break label1069;
        localck.eTC.setVisibility(0);
        localck.eTC.setText(com.tencent.mm.pluginsdk.e.m.b(this.jmH.agh(), localar1.kn(), false));
        if (localck.joB != null)
        {
          if (j == 0)
            break label1082;
          localck.joB.setVisibility(0);
        }
        int n = localar1.getType();
        if (localar1.jK() != 1)
          break label1095;
        bool2 = true;
        localcj2 = w(n, bool2);
        if (localcj2 != null)
        {
          this.jpU[paramInt] = ((short)localcj2.aUP());
          localck.joE = 0L;
          if ((bg.ii() == null) || (bg.ii().kQ() == null) || (bg.ii().kP() != 0));
        }
      }
      try
      {
        localck.joE = Long.parseLong(bg.ii().kQ());
        hd localhd = this.jmH;
        long l1 = 30000L + this.jqM;
        long l2 = System.currentTimeMillis();
        this.jqM = l2;
        if (l1 < l2)
          this.hMJ = bg.qW().isSDCardAvailable();
        localcj2.a(localck, paramInt, localhd, localar1, this.hMJ);
        if ((localck.eTC.getVisibility() == 0) && (this.fPh != null))
        {
          localck.eTC.setTextColor(this.fPh.azE());
          if (this.fPh.azK())
          {
            localck.eTC.setShadowLayer(2.0F, 1.2F, 1.2F, this.fPh.azF());
            if (!this.fPh.azG())
              break label1127;
            localck.eTC.setBackgroundResource(h.Tu);
            localck.eTC.setPadding(this.jqb, this.jqa, this.jqb, this.jqa);
          }
        }
        else
        {
          if ((localck.joA != null) && (localck.joA.getVisibility() == 0) && (this.fPh != null) && (!this.cEh.equals("qqmail")))
          {
            localck.joA.setTextColor(this.fPh.azH());
            localck.joA.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
          }
          if (this.jqz)
          {
            if (!localar1.isSystem())
              break label1139;
            i1 = 0;
            if (i1 != 0);
          }
          else
          {
            if (!this.jqA)
              break label1145;
          }
          if (localck.eWo != null)
            localck.eWo.setChecked(this.jqB.contains(Long.valueOf(localar1.kk())));
          if (localck.gzU != null)
          {
            localck.gzU.setTag(Long.valueOf(localar1.kk()));
            localck.gzU.setOnClickListener(this.jqK);
          }
          localck.fj(true);
          Iterator localIterator = this.jqD.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            if (localEntry.getValue() == paramView)
            {
              this.jqD.remove(localEntry.getKey());
              this.jqE.remove(localEntry.getKey());
            }
          }
          this.jqD.put(Long.valueOf(localar1.kk()), paramView);
          if (localar1.aJA())
            this.jqE.put(Long.valueOf(localar1.kk()), Integer.valueOf(localar1.jK()));
          return paramView;
          label1023: i2 = 0;
          continue;
          i3 = 0;
          break label150;
          label1035: this.fpP[paramInt] = 1;
          break label167;
          label1045: i = 0;
          break label227;
          label1051: j = 0;
          break label243;
          label1057: bool1 = false;
          break label262;
          label1063: m = 0;
          break label382;
          label1069: localck.eTC.setVisibility(8);
          break label427;
          label1082: localck.joB.setVisibility(8);
          break label449;
          label1095: bool2 = false;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          localck.joE = 0L;
          continue;
          localck.eTC.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
          continue;
          label1127: localck.eTC.setBackgroundColor(0);
          continue;
          label1139: int i1 = 1;
          continue;
          label1145: localck.fj(false);
        }
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 58;
  }

  public final boolean isInEditMode()
  {
    return this.jqz;
  }

  public final void o(View.OnClickListener paramOnClickListener)
  {
    this.jqK = paramOnClickListener;
  }

  public final int qg(int paramInt)
  {
    if (this.jqy)
      return this.jqu;
    if (paramInt <= 0)
      return 0;
    if (this.jpW < paramInt)
    {
      int i = this.jpW;
      this.jpW = 0;
      return i;
    }
    this.jpW -= paramInt;
    return paramInt;
  }

  public final void qh(int paramInt)
  {
    ar localar = (ar)getItem(paramInt);
    if ((localar != null) && (localar.kk() != 0L))
      this.jpX.add(Long.valueOf(localar.kk()));
  }

  public final cj w(int paramInt, boolean paramBoolean)
  {
    Map localMap1 = jqF;
    StringBuilder localStringBuilder1 = new StringBuilder("T").append(paramInt);
    String str1;
    int i;
    Map localMap2;
    StringBuilder localStringBuilder2;
    if (paramBoolean)
    {
      str1 = "S";
      i = ap.a((Integer)localMap1.get(str1));
      if (i == 0)
      {
        localMap2 = jqF;
        localStringBuilder2 = new StringBuilder("T1");
        if (!paramBoolean)
          break label133;
      }
    }
    label133: for (String str2 = "S"; ; str2 = "R")
    {
      i = ap.a((Integer)localMap2.get(str2));
      return (cj)this.jqG.get(Integer.valueOf(i));
      str1 = "R";
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fn
 * JD-Core Version:    0.6.2
 */
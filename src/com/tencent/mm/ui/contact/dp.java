package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelsearch.d;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dp extends cb
{
  public static final ColorStateList feQ = a.m(ak.getContext(), f.Ou);
  public static final ColorStateList feR = a.m(ak.getContext(), f.Oi);
  private String dWU = "";
  private com.tencent.mm.ui.applet.b dtE = null;
  private boolean eTA = false;
  protected List edM = null;
  protected dj ekC = MMSlideDelView.aSu();
  private List fpG;
  private int gjw = 0;
  private com.tencent.mm.modelsearch.k gmB = new dr(this);
  private int gnp = 2147483647;
  private int gns = 2147483647;
  private List jAA;
  private Set jAY;
  private Set jAZ;
  protected SelectContactUI jBa;
  private int jBb = 0;
  private dt jBc;
  private boolean jBd;
  private boolean jBe = true;
  private boolean jBf = true;
  private boolean jBg = false;
  private List jBh;
  private boolean jBi = true;
  private List jBj;
  private int jBk;
  private String jBl;
  private boolean jBm = false;
  private List jBn;
  private SparseIntArray jBo = new SparseIntArray();
  private String[] jmD = null;
  protected String jwY = null;
  protected String jxa = null;
  private int jxd = 0;
  protected int[] jxe;
  private String[] jxf;
  private int jxi = 0;
  private boolean jxj = true;
  private boolean jxl = false;
  private LinkedList jxo = new LinkedList();
  private boolean jxp;
  private SparseArray jxr = new SparseArray();
  private int type;

  public dp(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, paramString1, paramString2, 1, false);
  }

  public dp(Context paramContext, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    super(paramContext, new bc());
    this.context = paramContext;
    this.jwY = paramString1;
    this.jxa = paramString2;
    this.type = paramInt;
    this.jxl = paramBoolean;
    this.jAY = new HashSet();
    this.jAZ = new HashSet();
    this.jBd = x.pQ();
  }

  private boolean CE(String paramString)
  {
    boolean bool1;
    if ((paramString == null) || (paramString.length() <= 0))
      bool1 = true;
    boolean bool2;
    do
    {
      return bool1;
      bool2 = y.e(fF(false));
      bool1 = false;
    }
    while (bool2);
    if ((x.cY(paramString)) && (this.jAY.size() == 0))
    {
      com.tencent.mm.ui.base.e.b(this.context, n.bPA, n.buo);
      return false;
    }
    if ((fF(false).size() > 0) && (!y.db(paramString)) && (!y.de(paramString)) && (this.type != 11))
    {
      com.tencent.mm.ui.base.e.o(this.context, this.context.getString(n.caJ), this.context.getString(n.buo));
      return false;
    }
    return true;
  }

  private int a(com.tencent.mm.storage.i parami, int paramInt)
  {
    if (paramInt < this.jBk)
      return 31;
    if (paramInt < this.jBb + this.jBk)
      return 33;
    if (paramInt < this.jBb + this.jxi + this.jBk)
      return 32;
    return parami.jc();
  }

  private static bc a(bc parambc, Cursor paramCursor)
  {
    if (parambc == null)
      parambc = new bc();
    com.tencent.mm.storage.i locali = bg.qW().oT().ym(com.tencent.mm.storage.i.g(paramCursor));
    if (locali == null)
    {
      parambc.elz.b(paramCursor);
      bg.qW().oT().C(parambc.elz);
      return parambc;
    }
    parambc.elz = locali;
    return parambc;
  }

  private boolean aWK()
  {
    return (this.jBf) && ((this.jwY.equals("@micromsg.qq.com")) || (this.jwY.equals("@all.contact.without.chatroom")));
  }

  private Cursor aXC()
  {
    List localList = this.jBj;
    Cursor localCursor = null;
    if (localList != null)
    {
      int i = this.jBj.size();
      localCursor = null;
      if (i > 0)
      {
        localCursor = bg.qW().oT().aK(this.jBj);
        if ((localCursor != null) && (localCursor.moveToFirst()))
          this.jBk = localCursor.getCount();
      }
    }
    if (localCursor == null)
      localCursor = com.tencent.mm.as.c.aKQ();
    return localCursor;
  }

  private Cursor aXD()
  {
    com.tencent.mm.as.h localh = bg.qW().oO();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select rcontact.*");
    localStringBuilder.append(" from rconversation, rcontact");
    localStringBuilder.append(" where rconversation.username").append("=rcontact.username");
    localStringBuilder.append(" and rcontact.verifyFlag").append("&8==0");
    localStringBuilder.append(" and rcontact.username").append("!='officialaccounts'");
    if (this.jBn == null)
      this.jBn = new ArrayList();
    if (this.edM != null)
      this.jBn.addAll(this.edM);
    this.jBn.add("weixin");
    this.jBn.add("weibo");
    this.jBn.add("qqmail");
    this.jBn.add("fmessage");
    this.jBn.add("tmessage");
    this.jBn.add("qmessage");
    this.jBn.add("qqsync");
    this.jBn.add("floatbottle");
    this.jBn.add("lbsapp");
    this.jBn.add("shakeapp");
    this.jBn.add("medianote");
    this.jBn.add("qqfriend");
    this.jBn.add("readerapp");
    this.jBn.add("newsapp");
    this.jBn.add("blogapp");
    this.jBn.add("facebookapp");
    this.jBn.add("masssendapp");
    this.jBn.add("meishiapp");
    this.jBn.add("feedsapp");
    this.jBn.add("voipapp");
    this.jBn.add("filehelper");
    this.jBn.add("officialaccounts");
    this.jBn.add("helper_entry");
    this.jBn.add("pc_share");
    this.jBn.add("cardpackage");
    this.jBn.add("voicevoipapp");
    this.jBn.add("voiceinputapp");
    this.jBn.add("linkedinplugin");
    if (this.jBn != null)
    {
      Iterator localIterator2 = this.jBn.iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append(" and rcontact.username").append("!='").append(str2).append("'");
      }
    }
    if ((this.jBh != null) && (this.jBh.size() > 0))
    {
      Iterator localIterator1 = this.jBh.iterator();
      while (localIterator1.hasNext())
      {
        String str1 = (String)localIterator1.next();
        localStringBuilder.append(" and rcontact.username").append(" not like '%").append(str1).append("' ");
      }
    }
    localStringBuilder.append(" order by rconversation.conversationTime").append(" desc");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localStringBuilder.toString();
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "latest contact with conversation sql: %s", arrayOfObject);
    Cursor localCursor = localh.rawQuery(localStringBuilder.toString(), null);
    if ((localCursor != null) && (localCursor.moveToFirst()))
      this.jBb = localCursor.getCount();
    return localCursor;
  }

  private void aXE()
  {
    if (this.eTA)
    {
      if (this.dWU != null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.dWU;
        z.i("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "search text %s", arrayOfObject);
        if (this.type == 11)
          com.tencent.mm.modelsearch.c.a(this.dWU, new int[] { 131072, 131073 }, new d(), this.gmB, new cm());
      }
      else
      {
        return;
      }
      com.tencent.mm.modelsearch.c.a(this.dWU, new int[] { 131072 }, new d(), this.gmB, new cm());
      return;
    }
    DW();
  }

  private String b(com.tencent.mm.storage.i parami, int paramInt)
  {
    String str1;
    if (paramInt < this.jBk)
      str1 = this.jBl;
    do
    {
      return str1;
      if (paramInt < this.jBb + this.jBk)
        return getString(n.bsl);
      if (paramInt < this.jBb + this.jxi + this.jBk)
        return getString(n.bsg);
      if (parami.jc() == 31)
        return "";
      if (parami.jc() == 123)
        return "#";
      if (parami.jc() == 33)
        return getString(n.brS);
      if (parami.jc() == 43)
        return getString(n.caw);
      if (parami.jc() == 32)
        return getString(n.bsg);
      if (parami.jc() == 33)
        return getString(n.bsl);
      str1 = (String)this.jxr.get(parami.jc());
    }
    while (str1 != null);
    String str2 = String.valueOf((char)parami.jc());
    this.jxr.put(parami.jc(), str2);
    return str2;
  }

  private String getString(int paramInt)
  {
    String str = (String)this.jxr.get(paramInt);
    if (str == null)
    {
      str = this.context.getString(paramInt);
      this.jxr.put(paramInt, str);
    }
    return str;
  }

  public final void CA(String paramString)
  {
    if (ap.jb(paramString))
      return;
    this.jBh = ap.b(paramString.split(","));
  }

  public final void CB(String paramString)
  {
    if (!this.jAY.contains(paramString))
    {
      if (!CE(paramString))
        return;
      this.jAY.add(paramString);
    }
    while (true)
    {
      notifyDataSetChanged();
      return;
      this.jAY.remove(paramString);
    }
  }

  public final boolean CF(String paramString)
  {
    return (!ap.jb(paramString)) && ((this.jAY.contains(paramString)) || (this.jAZ.contains(paramString)));
  }

  public final void Cz(String paramString)
  {
    this.jBl = paramString;
  }

  public final void DW()
  {
    int i;
    long l1;
    com.tencent.mm.as.h localh2;
    StringBuilder localStringBuilder2;
    while (true)
    {
      try
      {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
          i = 1;
          l1 = System.currentTimeMillis();
          this.jBb = 0;
          this.jxi = 0;
          this.jBk = 0;
          if (this.type != 8)
            break label294;
          localh2 = bg.qW().oO();
          localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append("select rcontact.*");
          localStringBuilder2.append(" from rconversation, rcontact");
          localStringBuilder2.append(" where rconversation.username").append("=rcontact.username");
          localStringBuilder2.append(" and rcontact.verifyFlag").append("&8==0");
          localStringBuilder2.append(" and rcontact.username").append("!='officialaccounts'");
          if (this.edM == null)
            break;
          Iterator localIterator2 = this.edM.iterator();
          if (!localIterator2.hasNext())
            break;
          String str2 = (String)localIterator2.next();
          localStringBuilder2.append(" and rcontact.username").append("!='").append(str2).append("'");
          continue;
        }
      }
      finally
      {
      }
      i = 0;
    }
    localStringBuilder2.append(" order by rconversation.conversationTime").append(" desc");
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = localStringBuilder2.toString();
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "latest contact with conversation sql: %s", arrayOfObject2);
    Cursor localCursor1 = localh2.rawQuery(localStringBuilder2.toString(), null);
    if (i != 0)
      e(localCursor1);
    while (true)
    {
      z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin resetCursor" + (System.currentTimeMillis() - l1));
      return;
      label294: if (this.type == 11)
      {
        if (ch.jb(this.dWU))
        {
          com.tencent.mm.as.h localh1 = bg.qW().oO();
          StringBuilder localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("select rcontact.*");
          localStringBuilder1.append(" from rconversation, rcontact");
          localStringBuilder1.append(" where rconversation.username").append("=rcontact.username");
          localStringBuilder1.append(" and rcontact.verifyFlag").append("&8==0");
          localStringBuilder1.append(" and rcontact.username").append("!='officialaccounts'");
          if (this.edM != null)
          {
            Iterator localIterator1 = this.edM.iterator();
            while (localIterator1.hasNext())
            {
              String str1 = (String)localIterator1.next();
              localStringBuilder1.append(" and rcontact.username").append("!='").append(str1).append("'");
            }
          }
          localStringBuilder1.append(" order by rconversation.conversationTime").append(" desc");
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localStringBuilder1.toString();
          z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "latest contact with conversation sql: %s", arrayOfObject1);
          Cursor localCursor5 = localh1.rawQuery(localStringBuilder1.toString(), null);
          if ((localCursor5 != null) && (localCursor5.moveToFirst()))
            this.jBb = localCursor5.getCount();
          localCursor1 = bg.qW().oT().a(this.jwY, this.edM, localCursor5, this.dWU);
          if (!ap.jb(this.dWU))
            break;
          this.jxi = bg.qW().oT().aY(this.edM);
          break;
        }
        localCursor1 = bg.qW().oT().a(this.dWU, "@micromsg.qq.com", this.jxa, this.edM, true);
        break;
      }
      if (this.jmD != null)
      {
        localCursor1 = bg.qW().oT().a(this.jmD, this.jwY, this.jxa, this.edM);
        if (!aWK())
          break;
        this.jxi = 0;
        break;
      }
      if ((this.dWU == null) || (this.dWU.length() <= 0))
      {
        long l2 = System.currentTimeMillis();
        if (this.jBm);
        ArrayList localArrayList;
        LinkedList localLinkedList;
        for (localCursor1 = aXC(); ; localCursor1 = bg.qW().oT().a(this.jwY, this.jxa, this.edM, localLinkedList, localArrayList))
        {
          z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin setCursor : " + (System.currentTimeMillis() - l2));
          break;
          localArrayList = new ArrayList();
          if ((this.jBj != null) && (this.jBj.size() > 0))
          {
            Cursor localCursor4 = aXC();
            if ((localCursor4 != null) && (localCursor4.moveToFirst()))
            {
              this.jBk = localCursor4.getCount();
              localArrayList.add(localCursor4);
            }
          }
          if (this.jBg)
          {
            Cursor localCursor3 = aXD();
            if ((localCursor3 != null) && (localCursor3.moveToFirst()))
            {
              this.jBb = localCursor3.getCount();
              localArrayList.add(localCursor3);
            }
          }
          if (aWK())
          {
            Cursor localCursor2 = bg.qW().oT().d(this.edM, this.jxl);
            if ((localCursor2 != null) && (localCursor2.moveToFirst()))
            {
              this.jxi = localCursor2.getCount();
              localArrayList.add(localCursor2);
            }
          }
          localLinkedList = new LinkedList();
          if ((this.jBi) && (!"@black.android".equals(this.jwY)) && (!"@t.qq.com".equals(this.jwY)))
            localLinkedList.add("weixin");
        }
      }
      localCursor1 = bg.qW().oT().d(this.dWU, this.jwY, this.jxa, this.edM);
      if (!aWK())
        break;
      this.jxi = 0;
      break;
      am.h(new dq(this, localCursor1));
    }
  }

  protected final void DX()
  {
    DW();
  }

  public final void G(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0));
    while (true)
    {
      return;
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!this.jAY.contains(str))
          this.jAY.add(str);
        else
          this.jAY.remove(str);
      }
    }
  }

  public final void H(ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 0);
    while (true)
    {
      return;
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!this.jAY.contains(str))
          this.jAY.add(str);
      }
    }
  }

  public final void a(SelectContactUI paramSelectContactUI)
  {
    this.jBa = paramSelectContactUI;
  }

  public final void a(dt paramdt)
  {
    this.jBc = paramdt;
  }

  public final void a(String paramString, ao paramao)
  {
    if (paramString != null);
    do
    {
      return;
      if (this.iLp != null)
        this.iLp.DU();
      aXE();
    }
    while (this.iLp == null);
    am.h(new ds(this));
  }

  public final String[] aWJ()
  {
    z.v("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "getSections");
    return this.jxf;
  }

  protected final void aWL()
  {
    if (this.jmD != null)
    {
      this.jxe = y.a(this.jwY, this.jxa, this.edM, this.jmD);
      this.jxf = y.a(this.jwY, this.jxa, this.jmD, this.edM);
      return;
    }
    long l = System.currentTimeMillis();
    this.jxe = y.a(this.jwY, this.jxa, this.edM, this.dWU);
    this.jxf = y.a(this.jwY, this.jxa, this.dWU, this.edM);
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin resetShowHead part1 : " + (System.currentTimeMillis() - l));
  }

  public final List aXA()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.jAZ);
    return localArrayList;
  }

  public final int aXB()
  {
    return this.jBb;
  }

  public final void aXF()
  {
    this.jBm = true;
  }

  public final ArrayList aXv()
  {
    ArrayList localArrayList = fF(false);
    Iterator localIterator = this.jAZ.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!localArrayList.contains(str))
        localArrayList.add(str);
    }
    return localArrayList;
  }

  public final boolean aXw()
  {
    return this.eTA;
  }

  public final boolean aXx()
  {
    return this.jAY.size() > this.jxd;
  }

  public final List aXy()
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator1 = this.jAY.iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      if (y.de(str1))
      {
        List localList = com.tencent.mm.model.v.cV(str1);
        if (localList != null)
        {
          Iterator localIterator2 = localList.iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            if (!str2.equals(x.pG()))
              localLinkedList.add(str2);
          }
        }
      }
      else
      {
        localLinkedList.add(str1);
      }
    }
    return localLinkedList;
  }

  public final List aXz()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.jAY);
    return localArrayList;
  }

  public final void b(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    this.jxj = true;
    if (paramArrayOfString != null)
    {
      this.dWU = null;
      this.jmD = paramArrayOfString;
      this.jxj = paramBoolean;
      aXE();
      return;
    }
    String str = paramString.trim();
    if (str.startsWith("@"))
      if ((this.jwY == null) || (this.jwY.length() <= 0))
        break label141;
    label141: for (str = str.substring(1) + "%" + this.jwY; ; str = str.substring(1) + "%@t.qq.com")
    {
      z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "dkvoice [" + str + "]");
      this.dWU = str;
      this.jmD = null;
      break;
    }
  }

  public final void bc(List paramList)
  {
    if (this.edM == null)
      this.edM = new LinkedList();
    this.edM.clear();
    this.edM.addAll(paramList);
    if ((this.type != 2) && (this.type != 4))
      this.edM.add(x.pG());
    com.tencent.mm.storage.cj localcj = bg.qW().oY().zX("@t.qq.com");
    if (localcj != null)
      this.edM.add(localcj.getName());
    switch (this.type)
    {
    case 2:
    case 6:
    case 8:
    case 9:
    default:
      z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "unknow type for add blocklist");
    case 0:
    case 1:
    case 3:
    case 4:
    case 5:
    case 7:
    case 10:
    }
    while (true)
    {
      return;
      Iterator localIterator = y.qj().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.edM.add(str);
      }
    }
  }

  public final void bf(List paramList)
  {
    this.jBj = paramList;
  }

  public final void bg(List paramList)
  {
    if (paramList == null)
      return;
    com.tencent.mm.storage.i locali = x.qh();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.equals(locali.getUsername()))
        this.jAY.add(locali.getUsername());
      else
        this.jAY.add(str);
    }
    this.jxd = this.jAY.size();
    a(null, null);
  }

  public final void bh(List paramList)
  {
    if (paramList != null)
      this.jAZ.addAll(paramList);
  }

  public final void d(String paramString, String[] paramArrayOfString)
  {
    b(paramString, null, false);
  }

  public final void detach()
  {
    if (this.dtE != null)
    {
      this.dtE.detach();
      this.dtE = null;
    }
  }

  public final void e(Cursor paramCursor)
  {
    closeCursor();
    setCursor(paramCursor);
    notifyDataSetChanged();
    long l1 = System.currentTimeMillis();
    if (this.iLp != null)
      this.iLp.DT();
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin onPostReset" + (System.currentTimeMillis() - l1));
    long l2 = System.currentTimeMillis();
    if ((this.dWU != null) && (this.jBc != null))
      this.jBc.pd(paramCursor.getCount());
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin onTextSearchChange" + (System.currentTimeMillis() - l2));
    long l3 = System.currentTimeMillis();
    aWL();
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin resetShowHead" + (System.currentTimeMillis() - l3));
  }

  public final void fC(boolean paramBoolean)
  {
    this.jBe = paramBoolean;
  }

  public final void fD(boolean paramBoolean)
  {
    this.jBf = paramBoolean;
  }

  public final void fE(boolean paramBoolean)
  {
    this.jBg = paramBoolean;
  }

  public final ArrayList fF(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = this.jAY.iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "selectedContact.userName" + str1);
      if ((!paramBoolean) && (y.de(str1)))
      {
        List localList = com.tencent.mm.model.v.cV(str1);
        if (localList != null)
        {
          Iterator localIterator2 = localList.iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            if (!localHashSet.contains(str2))
            {
              localArrayList.add(str2);
              localHashSet.add(str2);
            }
          }
        }
      }
      else if (!localHashSet.contains(str1))
      {
        localArrayList.add(str1);
        localHashSet.add(str1);
      }
    }
    return localArrayList;
  }

  public final void fv(boolean paramBoolean)
  {
    this.eTA = paramBoolean;
  }

  public final int getCount()
  {
    int i;
    if (this.eTA)
      if ((this.fpG != null) && (this.jAA != null))
        i = 0 + this.fpG.size() + this.jAA.size();
    long l;
    do
    {
      return i;
      z.i("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "serach contact list empty");
      return 0;
      l = System.currentTimeMillis();
      i = getCursor().getCount();
    }
    while (System.currentTimeMillis() - l <= 5L);
    z.d("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "kevin getCursor().getCount() : " + (System.currentTimeMillis() - l));
    return i;
  }

  public final int getPositionForSection(int paramInt)
  {
    if ((this.jxe != null) && (paramInt >= 0) && (paramInt < this.jxe.length))
      paramInt = this.jxe[paramInt];
    return paramInt + this.jxi + this.jBb + this.jBk;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.jxp)
    {
      for (int m = 0; m < 8; m++)
        this.jxo.add(View.inflate(this.context, com.tencent.mm.k.baH, null));
      this.jxp = true;
    }
    bc localbc1 = hX(paramInt);
    com.tencent.mm.storage.i locali1 = localbc1.elz;
    View localView1;
    du localdu1;
    label234: CharSequence localCharSequence1;
    if (paramView == null)
      if (this.jxo.size() > 0)
      {
        View localView2 = (View)this.jxo.getFirst();
        this.jxo.removeFirst();
        localView1 = localView2;
        du localdu2 = new du();
        localdu2.egz = ((TextView)localView1.findViewById(com.tencent.mm.i.aoA));
        localdu2.jxx = localView1.findViewById(com.tencent.mm.i.aOh);
        localdu2.jBq = ((TextView)localView1.findViewById(com.tencent.mm.i.aoB));
        localdu2.feV = ((AddressView)localView1.findViewById(com.tencent.mm.i.aFu));
        localdu2.egC = ((CheckBox)localView1.findViewById(com.tencent.mm.i.aoE));
        localdu2.jxw = ((TextView)localView1.findViewById(com.tencent.mm.i.aox));
        if (this.jBa != null)
          this.jBa.eue.a(localdu2.feV);
        localView1.setTag(localdu2);
        localdu1 = localdu2;
        if (!this.eTA)
          break label850;
        if (paramInt != this.gnp)
          break label792;
        localdu1.egz.setText(n.brY);
        localdu1.egz.setVisibility(0);
        label269: if (paramInt < -1 + this.gjw)
          break label836;
        localdu1.jxx.setBackgroundResource(com.tencent.mm.h.Uk);
        label290: com.tencent.mm.pluginsdk.ui.c.a(localdu1.feV, locali1.getUsername());
        if (locali1.jd() == 0)
          break label1180;
        String str2 = at.qz().cJ(locali1.jd());
        if (str2 == null)
          break label1168;
        Bitmap localBitmap = com.tencent.mm.q.v.fJ(str2);
        localdu1.feV.setMaskBitmap(localBitmap);
        label348: if (locali1.jm() != 1)
          break label1192;
        localdu1.feV.setNickNameTextColor(feR);
        localdu1.feV.updateTextColors();
        localCharSequence1 = locali1.aHW();
        if (localCharSequence1 != null)
          break label1214;
      }
    label1168: label1298: 
    while (true)
    {
      try
      {
        Context localContext = this.context;
        locali1.getUsername();
        String str1 = y.dh(locali1.getUsername());
        if (("".length() > 0) && (!"".equals(str1)))
        {
          StringBuilder localStringBuilder = new StringBuilder(32);
          localStringBuilder.append(str1);
          localStringBuilder.append("(");
          localStringBuilder.append("");
          localStringBuilder.append(")");
          str1 = localStringBuilder.toString();
        }
        CharSequence localCharSequence2 = com.tencent.mm.ar.b.f(localContext, str1, (int)localdu1.feV.getNickNameSize());
        localObject = localCharSequence2;
        if (localObject == null)
          localObject = "";
        localdu1.feV.setName((CharSequence)localObject);
        locali1.q((CharSequence)localObject);
        if (localbc1.jyu)
          break label1227;
        localdu1.feV.setDescription("");
        if ((!this.jBe) || ((this.type != 5) && (this.type != 1) && (this.type != 0) && (this.type != 3) && ((this.type != 7) || (this.jBd)) && (this.type != 8) && (this.type != 10) && (this.type != 11) && (this.type != 13)))
          break label1285;
        boolean bool1 = this.jAY.contains(locali1.getUsername());
        boolean bool2 = this.jAZ.contains(locali1.getUsername());
        localdu1.egC.setVisibility(0);
        if (bool2)
          break label1264;
        localdu1.egC.setChecked(bool1);
        localdu1.egC.setEnabled(true);
        localdu1.feV.updatePositionFlag();
        if (locali1.jm() != 1)
          break label1298;
        localdu1.jxw.setVisibility(0);
        localdu1.egC.setVisibility(8);
        localdu1.feV.setContentDescription(localdu1.feV.getNickName().toString());
        return localView1;
        localView1 = View.inflate(this.context, com.tencent.mm.k.baH, null);
        break;
        localdu1 = (du)paramView.getTag();
        localView1 = paramView;
        break label234;
        label792: if (paramInt == this.gns)
        {
          localdu1.egz.setText(n.brW);
          localdu1.egz.setVisibility(0);
          break label269;
        }
        localdu1.egz.setVisibility(8);
        break label269;
        label836: localdu1.jxx.setBackgroundResource(com.tencent.mm.h.Uj);
        break label290;
        label850: if (this.type == 8)
        {
          if (paramInt == 0)
          {
            localdu1.egz.setVisibility(0);
            localdu1.egz.setText(getString(n.bTm));
            break label290;
          }
          localdu1.egz.setVisibility(8);
          break label290;
        }
        bc localbc2 = hX(paramInt - 1);
        bc localbc3 = hX(paramInt + 1);
        int j;
        if (localbc2 == null)
        {
          locali2 = null;
          if (localbc3 != null)
            continue;
          locali3 = null;
          if (locali2 != null)
            continue;
          i = -1;
          j = a(locali1, paramInt);
          if (locali3 != null)
            continue;
          k = -1;
          if (!this.jxj)
            continue;
          if (paramInt != 0)
            continue;
          String str4 = b(locali1, paramInt);
          if (ap.jb(str4))
            continue;
          localdu1.egz.setVisibility(0);
          localdu1.egz.setText(str4);
          if ((!this.jxj) || (j == k) || (-1 == k))
            continue;
          localdu1.jxx.setBackgroundResource(com.tencent.mm.h.Uk);
          break label290;
        }
        com.tencent.mm.storage.i locali2 = localbc2.elz;
        continue;
        com.tencent.mm.storage.i locali3 = localbc3.elz;
        continue;
        int i = a(locali2, paramInt - 1);
        continue;
        int k = a(locali3, paramInt + 1);
        continue;
        if ((paramInt > 0) && (j != i))
        {
          String str3 = b(locali1, paramInt);
          if (!ap.jb(str3))
          {
            localdu1.egz.setVisibility(0);
            localdu1.egz.setText(str3);
            continue;
          }
        }
        localdu1.egz.setVisibility(8);
        continue;
        localdu1.jxx.setBackgroundResource(com.tencent.mm.h.Uj);
        break label290;
        localdu1.feV.setMaskBitmap(null);
        break label348;
        label1180: localdu1.feV.setMaskBitmap(null);
        break label348;
        label1192: localdu1.feV.setNickNameTextColor(feQ);
      }
      catch (Exception localException)
      {
        Object localObject = null;
        continue;
      }
      label1214: localdu1.feV.setName(localCharSequence1);
      continue;
      label1227: if (localbc1.jyw == null)
      {
        localdu1.feV.setDescription("");
      }
      else
      {
        localdu1.feV.setDescription(localbc1.jyw);
        continue;
        label1264: localdu1.egC.setChecked(true);
        localdu1.egC.setEnabled(false);
        continue;
        localdu1.egC.setVisibility(8);
        continue;
        localdu1.jxw.setVisibility(8);
      }
    }
  }

  public final bc hX(int paramInt)
  {
    if (oL(paramInt))
      localObject = (bc)aPB();
    do
    {
      return localObject;
      if (this.iLo == null)
        break;
      localObject = (bc)this.iLo.get(Integer.valueOf(paramInt));
    }
    while (localObject != null);
    bc localbc;
    if (this.eTA)
      if ((this.fpG != null) && (paramInt >= 0) && (-1 + getCount() >= paramInt))
      {
        localbc = new bc();
        if ((paramInt >= this.gnp) && (paramInt < this.gns))
        {
          localbc.gpv = ((com.tencent.mm.modelsearch.h)this.fpG.get(paramInt));
          label117: localbc.jyu = true;
          o localo = bg.qW().oT();
          com.tencent.mm.storage.i locali = localo.ym(localbc.gpv.dBO);
          if (locali == null)
          {
            locali = localo.yr(localbc.gpv.dBO);
            localo.C(locali);
          }
          localbc.elz = locali;
          localbc.jyw = cj.a(this.jBa, localbc);
        }
      }
    for (Object localObject = localbc; ; localObject = a(null, getCursor()))
    {
      if (this.iLo == null)
        aPz();
      if (this.iLo == null)
        break;
      this.iLo.put(Integer.valueOf(paramInt), localObject);
      return localObject;
      localbc.gpv = ((com.tencent.mm.modelsearch.h)this.jAA.get(paramInt - this.gns));
      break label117;
      return null;
      if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
        return null;
    }
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.dtE != null)
      this.dtE.onTouchEvent(paramMotionEvent);
  }

  public final void qx(int paramInt)
  {
    String str = hX(paramInt).elz.getUsername();
    if (this.jAZ.contains(str));
    do
    {
      return;
      if (this.jAY.contains(str))
        break;
    }
    while (!CE(str));
    this.jAY.add(str);
    while (true)
    {
      notifyDataSetChanged();
      return;
      this.jAY.remove(str);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dp
 * JD-Core Version:    0.6.2
 */
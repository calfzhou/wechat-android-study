package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.c.a.lo;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.af;
import com.tencent.mm.pluginsdk.al;
import com.tencent.mm.pluginsdk.e.l;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.di;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;
import com.tencent.mm.ui.base.dm;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class r extends cb
  implements as
{
  private static long jFC = 2000L;
  private String dWU;
  protected List edM = null;
  protected di ekA;
  protected dl ekB;
  protected dj ekC = MMSlideDelView.aSu();
  protected dm ekz;
  private boolean fsF = false;
  boolean gCD = false;
  private final int jFA;
  private u jFB;
  private boolean jFD = false;
  private ay jFE = new ay(bg.qQ().getLooper(), new s(this), false);
  private ColorStateList[] jFh = new ColorStateList[5];
  private HashMap jFi;
  private boolean jFj = true;
  private z jFk;
  private Typeface jFl;
  private float jFm = -1.0F;
  private float jFn = -1.0F;
  private float jFo = -1.0F;
  private com.tencent.mm.pluginsdk.ui.e jFp;
  private boolean jFq = false;
  private boolean jFr = false;
  private boolean jFs = false;
  private boolean jFt = false;
  private w jFu;
  private com.tencent.mm.sdk.c.g jFv = null;
  private v jFw = null;
  public String jFx = "";
  final y jFy = new y(this);
  private final int jFz;

  public r(Context paramContext, cc paramcc)
  {
    super(paramContext, new com.tencent.mm.storage.r());
    super.a(paramcc);
    this.jFh[0] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Oi);
    this.jFh[1] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Oy);
    this.jFh[3] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.OD);
    this.jFh[2] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Ow);
    this.jFh[2] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Ow);
    this.jFh[4] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Om);
    this.jFi = new HashMap();
    this.jFA = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.Pp);
    this.jFz = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.Pq);
    this.jFm = paramContext.getResources().getDimension(com.tencent.mm.g.PI);
    this.jFn = paramContext.getResources().getDimension(com.tencent.mm.g.Pz);
    this.jFo = paramContext.getResources().getDimension(com.tencent.mm.g.PR);
    this.jFl = Typeface.create("sans-serif-medium", 0);
  }

  private static String CS(String paramString)
  {
    if ((paramString != null) && (paramString.length() == 32))
      return com.tencent.mm.pluginsdk.g.axR().kN(paramString);
    return null;
  }

  private CharSequence a(com.tencent.mm.storage.r paramr, int paramInt, boolean paramBoolean)
  {
    if ((!com.tencent.mm.platformtools.ap.jb(paramr.jT())) && ((paramr.jU() <= 0) || (paramr.jI() <= 0)))
    {
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(this.context.getString(n.bQL));
      localSpannableStringBuilder2.setSpan(new ForegroundColorSpan(-5569532), 0, localSpannableStringBuilder2.length(), 33);
      localSpannableStringBuilder2.append(" ").append(com.tencent.mm.ar.b.d(this.context, paramr.jT(), paramInt));
      return localSpannableStringBuilder2;
    }
    String str1 = paramr.getUsername();
    if (str1.equals("qqmail"))
    {
      if (com.tencent.mm.platformtools.ap.a((Integer)bg.qW().oQ().get(17)) == 1);
      for (int m = 1; m == 0; m = 0)
        return this.context.getString(n.cgr);
    }
    if (str1.equals("tmessage"))
    {
      cj localcj = bg.qW().oY().zX("@t.qq.com");
      if ((localcj != null) && (localcj.aJt()));
      for (int k = 1; k == 0; k = 0)
        return this.context.getString(n.cgr);
    }
    if (str1.equals("qmessage"))
    {
      if ((0x40 & com.tencent.mm.model.x.pK()) != 0);
      for (int j = 1; j == 0; j = 0)
        return this.context.getString(n.cgr);
    }
    String str6;
    String str7;
    String str8;
    String str3;
    if ((paramr.jN() != null) && ((paramr.jN().equals("47")) || (paramr.jN().equals("1048625"))))
    {
      String str5 = CS(paramr.jL());
      str6 = "";
      if (str5 != null)
        return "[" + str5 + "]";
      if ((paramr.jL() != null) && (paramr.jL().contains(":")))
      {
        str6 = paramr.jL().substring(0, paramr.jL().indexOf(":"));
        String str9 = CS(paramr.jL().substring(1 + paramr.jL().indexOf(":")).replace(" ", ""));
        if (str9 != null)
        {
          String str10 = "[" + str9 + "]";
          if (com.tencent.mm.platformtools.ap.jb(str6))
            return str10;
          return str6 + ": " + str10;
        }
      }
      str7 = this.context.getString(n.btb);
      if (com.tencent.mm.platformtools.ap.jb(str6))
      {
        str8 = str7;
        paramr.bu(str8);
      }
    }
    else
    {
      if (com.tencent.mm.platformtools.ap.jb(paramr.jL()))
        break label718;
      if (com.tencent.mm.platformtools.ap.jb(paramr.jQ()))
        break label707;
      if ((paramr.jK() != 0) || (!com.tencent.mm.model.y.dc(paramr.getUsername())))
        break label695;
      str3 = com.tencent.mm.model.y.u(paramr.jQ(), paramr.getUsername());
    }
    String str2;
    while (true)
    {
      try
      {
        String str4 = String.format(paramr.jL(), new Object[] { str3 });
        str2 = str4;
        if ((paramr.jU() <= 0) || (paramr.jI() <= 0))
          break label749;
        SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(this.context.getString(n.bQJ));
        localSpannableStringBuilder1.setSpan(new ForegroundColorSpan(-5569532), 0, localSpannableStringBuilder1.length(), 33);
        localSpannableStringBuilder1.append(" ").append(com.tencent.mm.ar.b.d(this.context, str2, paramInt));
        return localSpannableStringBuilder1;
        str8 = str6 + ": " + str7;
        break;
        label695: str3 = com.tencent.mm.model.y.dh(paramr.jQ());
        continue;
        label707: str2 = paramr.jL();
        continue;
      }
      catch (Exception localException)
      {
      }
      label718: str2 = com.tencent.mm.booter.notification.a.m.a(paramr.jK(), paramr.getUsername(), paramr.getContent(), kx(paramr.jN()), this.context);
    }
    label749: if ((paramBoolean) && (paramr.jI() > 1))
    {
      Context localContext = this.context;
      int i = n.bQK;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramr.jI());
      arrayOfObject[1] = str2;
      str2 = localContext.getString(i, arrayOfObject);
    }
    return com.tencent.mm.ar.b.d(this.context, str2, paramInt);
  }

  private void aYb()
  {
    if (this.jFi == null);
    while (true)
    {
      return;
      Iterator localIterator = this.jFi.entrySet().iterator();
      while (localIterator.hasNext())
        ((x)((Map.Entry)localIterator.next()).getValue()).jFI = null;
    }
  }

  private void aYc()
  {
    am.h(new t(this));
  }

  private CharSequence i(com.tencent.mm.storage.r paramr)
  {
    if (paramr.getStatus() == 1)
      return this.context.getString(n.bRf);
    if (paramr.jM() == 9223372036854775807L)
      return "";
    return com.tencent.mm.pluginsdk.e.m.b(this.context, paramr.jM(), true);
  }

  private static int kx(String paramString)
  {
    int i = 1;
    if ((paramString != null) && (paramString.length() > 0));
    try
    {
      int j = Integer.valueOf(paramString).intValue();
      i = j;
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return i;
  }

  public void DW()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(this.fsF);
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "dkpno resetCursor search:%b", arrayOfObject);
    if (this.fsF)
    {
      Cursor[] arrayOfCursor = new Cursor[2];
      arrayOfCursor[0] = bg.qW().oW().b(com.tencent.mm.model.y.dkj, this.edM, this.dWU);
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      if ((this.edM != null) && (this.edM.size() > 0))
        localArrayList1.addAll(this.edM);
      try
      {
        while (arrayOfCursor[0].moveToNext())
        {
          String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
          localArrayList1.add(str);
          if (!str.endsWith("@chatroom"))
            localArrayList2.add(str);
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "block user " + str);
        }
      }
      catch (Exception localException)
      {
        localArrayList1.add("officialaccounts");
        localArrayList1.add("helper_entry");
        arrayOfCursor[1] = bg.qW().oT().c(this.dWU, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
        setCursor(new MergeCursor(arrayOfCursor));
      }
    }
    while (true)
    {
      if ((this.jFk != null) && (this.dWU != null))
        getCursor().getCount();
      super.notifyDataSetChanged();
      return;
      setCursor(bg.qW().oW().a(com.tencent.mm.model.y.dkj, this.edM, com.tencent.mm.h.a.dPB, false));
    }
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String)))
      return;
    a((String)paramObject, null);
  }

  public final void a(di paramdi)
  {
    this.ekA = paramdi;
  }

  public final void a(dl paramdl)
  {
    this.ekB = paramdl;
  }

  public final void a(dm paramdm)
  {
    this.ekz = paramdm;
  }

  public final void a(String paramString, ao paramao)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Boolean.valueOf(this.jFq);
    arrayOfObject1[1] = Boolean.valueOf(this.jFr);
    arrayOfObject1[2] = paramString;
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", arrayOfObject1);
    if ((!com.tencent.mm.platformtools.ap.jb(paramString)) && (this.jFi != null))
      this.jFi.remove(paramString);
    if (this.jFq)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Boolean.valueOf(this.jFD);
      arrayOfObject2[1] = Boolean.valueOf(this.jFE.aNx());
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "dkpno postTryNotify needNotify:%b timerStopped:%b", arrayOfObject2);
      this.jFD = true;
      if (this.jFE.aNx())
        aYc();
      return;
    }
    this.jFr = true;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.storage.r localr = (com.tencent.mm.storage.r)getItem(paramInt);
    String str1 = localr.getUsername();
    this.jFy.bJ(str1);
    this.jFB = new u(this, (byte)0);
    aa localaa2;
    View localView2;
    Object localObject;
    x localx;
    com.tencent.mm.storage.i locali;
    label450: boolean bool1;
    label458: boolean bool2;
    label481: boolean bool3;
    label504: boolean bool4;
    label548: label752: int j;
    label855: boolean bool5;
    label905: boolean bool6;
    label942: label1006: ViewGroup.LayoutParams localLayoutParams;
    label1074: label1106: label1255: lm locallm;
    if (paramView == null)
    {
      aa localaa1 = new aa();
      View localView1 = View.inflate(this.context, k.bdS, null);
      localaa1.egy = ((ImageView)localView1.findViewById(com.tencent.mm.i.ahd));
      c.a(localaa1.egy, str1);
      com.tencent.mm.pluginsdk.ui.a locala = (com.tencent.mm.pluginsdk.ui.a)localaa1.egy.getDrawable();
      if (this.jFp != null)
        this.jFp.a(locala);
      localaa1.jFW = ((NoMeasuredTextView)localView1.findViewById(com.tencent.mm.i.aGn));
      localaa1.jFX = ((NoMeasuredTextView)localView1.findViewById(com.tencent.mm.i.aTY));
      localaa1.jFY = ((NoMeasuredTextView)localView1.findViewById(com.tencent.mm.i.azM));
      localaa1.ekI = ((TextView)localView1.findViewById(com.tencent.mm.i.aST));
      localaa1.jFZ = ((ImageView)localView1.findViewById(com.tencent.mm.i.ayi));
      localaa1.jGc = localView1.findViewById(com.tencent.mm.i.ahf);
      localaa1.jGa = ((ImageView)localView1.findViewById(com.tencent.mm.i.aSx));
      localaa1.jGb = ((ImageView)localView1.findViewById(com.tencent.mm.i.aAN));
      localView1.setTag(localaa1);
      localaa1.jFY.ac(this.jFn);
      localaa1.jFX.ac(this.jFo);
      localaa1.jFW.ac(this.jFm);
      localaa1.jFY.setTextColor(this.jFh[0]);
      localaa1.jFX.setTextColor(this.jFh[4]);
      localaa1.jFW.setTextColor(this.jFh[3]);
      localaa1.jFY.eZ(true);
      localaa1.jFX.eZ(false);
      localaa1.jFW.eZ(true);
      localaa1.jFX.aTn();
      localaa1.jFW.setTypeface(this.jFl);
      localaa2 = localaa1;
      localView2 = localView1;
      localObject = (x)this.jFi.get(str1);
      if (localObject == null)
      {
        localx = new x(this, (byte)0);
        locali = this.jFy.aYd();
        if (locali == null)
          break label1628;
        localx.jFL = locali.jB();
        localx.Ea = ((int)locali.dhv);
        if (locali == null)
          break label1643;
        bool1 = true;
        localx.jFR = bool1;
        if ((locali == null) || (!locali.zX()))
          break label1649;
        bool2 = true;
        localx.jFT = bool2;
        if ((locali == null) || (locali.jv() != 0))
          break label1655;
        bool3 = true;
        localx.jFS = bool3;
        localx.joG = com.tencent.mm.model.y.dc(str1);
        if ((!localx.joG) || (!localx.jFS) || (localr.jI() <= 0))
          break label1661;
        bool4 = true;
        localx.jFQ = bool4;
        localx.fjl = 0;
        if ((kx(localr.jN()) == 34) && (localr.jK() == 0) && (!com.tencent.mm.platformtools.ap.jb(localr.getContent())))
        {
          String str4 = localr.getContent();
          if ((str1.equals("qmessage")) || (str1.equals("floatbottle")))
          {
            String[] arrayOfString = str4.split(":");
            if ((arrayOfString != null) && (arrayOfString.length > 3))
              str4 = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
          }
          if (!new bp(str4).BH())
            localx.fjl = 1;
        }
        String str2 = com.tencent.mm.model.y.a(locali, str1, localx.joG);
        if ((!localx.joG) || (str2 != null))
          break label1667;
        localx.nickName = this.context.getString(n.bAg);
        localx.jFI = i(localr);
        int i = (int)localaa2.jFY.getTextSize();
        localx.jFJ = a(localr, i, localx.jFQ);
        localx.jFU = localr.jS();
      }
      switch (localr.getStatus())
      {
      case 3:
      case 4:
      default:
        j = -1;
        localx.jFK = j;
        localx.jFM = com.tencent.mm.model.y.a(localr);
        bg.qW().oW();
        localx.jFN = com.tencent.mm.storage.s.g(localr);
        if ((locali != null) && (locali.zW()))
        {
          bool5 = true;
          localx.jFO = bool5;
          String str3 = com.tencent.mm.sdk.platformtools.y.aGW();
          if ((!str3.equalsIgnoreCase("zh_CN")) && (!str3.equalsIgnoreCase("zh_TW")))
            break label1737;
          bool6 = true;
          localx.jFP = bool6;
          this.jFi.put(str1, localx);
          localObject = localx;
          if (((x)localObject).jFI == null)
            ((x)localObject).jFI = i(localr);
          if (!((x)localObject).jFQ)
            break label1743;
          localaa2.jFY.setTextColor(this.jFh[0]);
          com.tencent.mm.booter.notification.a.m.bV(localaa2.jFY.getWidth());
          com.tencent.mm.booter.notification.a.m.bW((int)localaa2.jFY.getTextSize());
          com.tencent.mm.booter.notification.a.m.a(localaa2.jFY.getPaint());
          if (!str1.toLowerCase().endsWith("@t.qq.com"))
            break label1764;
          localaa2.jFW.pO(h.VU);
          localaa2.jFW.eY(true);
          int k = ((x)localObject).jFK;
          if (k == -1)
            break label1776;
          localaa2.jFY.pN(k);
          localaa2.jFY.eX(true);
          localaa2.jFW.setText(((x)localObject).nickName);
          localLayoutParams = localaa2.jFX.getLayoutParams();
          if (((x)localObject).jFI.length() <= 9)
            break label1788;
          if (localLayoutParams.width != this.jFA)
          {
            localLayoutParams.width = this.jFA;
            localaa2.jFX.setLayoutParams(localLayoutParams);
          }
          label1175: Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(localLayoutParams.width);
          com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "layout update time width %d", arrayOfObject);
          localaa2.jFX.setText(((x)localObject).jFI);
          localaa2.jFY.setText(((x)localObject).jFJ);
          if ((!((x)localObject).joG) || (!((x)localObject).jFS))
            break label1822;
          localaa2.jFZ.setVisibility(0);
          c.a(localaa2.egy, str1);
          if (this.jFj)
          {
            if ((localr != null) && (localaa2 != null) && (localObject != null))
              break label1855;
            com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "handle show tip cnt, but conversation or viewholder is null");
          }
          if ((!((x)localObject).jFM) && (((x)localObject).jFN) && (bg.oE()))
            bg.qW().oW().f(localr);
          if ((!((x)localObject).jFN) || (localr.jM() == -1L))
            break label2199;
          localView2.findViewById(com.tencent.mm.i.aoT).setBackgroundResource(h.Ui);
          label1369: com.tencent.mm.am.a.aCl();
          locallm = new lm();
          locallm.cOG.cOI = true;
          com.tencent.mm.sdk.c.a.aGB().g(locallm);
          if ((0L != com.tencent.mm.storage.s.a(localr, 7, 0L)) && (!localr.getUsername().equals(locallm.cOH.cOK)))
          {
            localr.l(com.tencent.mm.storage.s.a(localr, 6, localr.jM()));
            bg.qW().oW().a(localr, localr.getUsername());
          }
          if ((com.tencent.mm.pluginsdk.g.axT() != null) && (com.tencent.mm.pluginsdk.g.axT().sU(localr.getUsername())))
            break label2216;
          localaa2.jGa.setVisibility(8);
          label1500: if ((com.tencent.mm.pluginsdk.g.aya() == null) || (!com.tencent.mm.pluginsdk.g.aya().nR(localr.getUsername())))
            break label2272;
          localaa2.jGb.setVisibility(0);
        }
        break;
      case 0:
      case 1:
      case 2:
      case 5:
      }
    }
    while (true)
    {
      this.jFB.content = String.valueOf(((x)localObject).jFJ);
      this.jFB.dkB = String.valueOf(((x)localObject).nickName);
      this.jFB.jFH = String.valueOf(((x)localObject).jFI);
      u localu = this.jFB;
      com.tencent.mm.ui.a.a.aQs().a(localView2, localu.dkB, localu.jFG, localu.jFH, localu.content);
      return localView2;
      localaa2 = (aa)paramView.getTag();
      localView2 = paramView;
      break;
      label1628: localx.jFL = -1;
      localx.Ea = -1;
      break label450;
      label1643: bool1 = false;
      break label458;
      label1649: bool2 = false;
      break label481;
      label1655: bool3 = false;
      break label504;
      label1661: bool4 = false;
      break label548;
      label1667: localx.nickName = com.tencent.mm.ar.b.f(this.context, com.tencent.mm.model.y.a(locali, str1, localx.joG), (int)localaa2.jFW.getTextSize());
      break label752;
      j = -1;
      break label855;
      j = h.Xb;
      break label855;
      j = -1;
      break label855;
      j = h.WZ;
      break label855;
      bool5 = false;
      break label905;
      label1737: bool6 = false;
      break label942;
      label1743: localaa2.jFY.setTextColor(this.jFh[localObject.fjl]);
      break label1006;
      label1764: localaa2.jFW.eY(false);
      break label1074;
      label1776: localaa2.jFY.eX(false);
      break label1106;
      label1788: if (localLayoutParams.width == this.jFz)
        break label1175;
      localLayoutParams.width = this.jFz;
      localaa2.jFX.setLayoutParams(localLayoutParams);
      break label1175;
      label1822: if (((x)localObject).jFO)
      {
        localaa2.jFZ.setVisibility(0);
        break label1255;
      }
      localaa2.jFZ.setVisibility(8);
      break label1255;
      label1855: localaa2.ekI.setVisibility(4);
      localaa2.jGc.setVisibility(4);
      if (com.tencent.mm.model.y.dG(localr.getUsername()))
      {
        View localView5 = localaa2.jGc;
        if (localr.jI() > 0);
        for (int i2 = 0; ; i2 = 4)
        {
          localView5.setVisibility(i2);
          localaa2.jFW.setTextColor(this.jFh[3]);
          break;
        }
      }
      NoMeasuredTextView localNoMeasuredTextView = localaa2.jFW;
      if ((((x)localObject).jFR) && (((x)localObject).jFL == 1));
      for (ColorStateList localColorStateList = this.jFh[2]; ; localColorStateList = this.jFh[3])
      {
        localNoMeasuredTextView.setTextColor(localColorStateList);
        if ((((x)localObject).jFR) && (((x)localObject).Ea != 0))
          break label2010;
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "handle show tip count, but talker is null");
        break;
      }
      label2010: if ((((x)localObject).jFO) && (((x)localObject).jFT))
      {
        View localView4 = localaa2.jGc;
        if (localr.jI() > 0);
        for (int i1 = 0; ; i1 = 4)
        {
          localView4.setVisibility(i1);
          break;
        }
      }
      if ((((x)localObject).joG) && (((x)localObject).jFS))
      {
        View localView3 = localaa2.jGc;
        if (localr.jI() > 0);
        for (int n = 0; ; n = 4)
        {
          localView3.setVisibility(n);
          break;
        }
      }
      int m = localr.jI();
      if (m > 100)
      {
        localaa2.ekI.setText(n.cmN);
        localaa2.ekI.setVisibility(0);
      }
      while (true)
      {
        this.jFB.jFG = m;
        break;
        if (m > 0)
        {
          localaa2.ekI.setText(localr.jI());
          localaa2.ekI.setVisibility(0);
        }
      }
      label2199: localView2.findViewById(com.tencent.mm.i.aoT).setBackgroundResource(h.Uj);
      break label1369;
      label2216: localaa2.jGa.setVisibility(0);
      if (localr.getUsername().equals(locallm.cOH.cOK))
      {
        localaa2.jGa.setImageResource(h.abO);
        break label1500;
      }
      localaa2.jGa.setImageResource(h.abM);
      break label1500;
      label2272: localaa2.jGb.setVisibility(8);
    }
  }

  public final void onDestroy()
  {
    this.jFE.aNu();
    this.jFw = null;
    this.jFu = null;
    if (this.jFi != null)
    {
      this.jFi.clear();
      this.jFi = null;
    }
    closeCursor();
    aOD();
  }

  public final void onPause()
  {
    if (this.ekC != null)
      this.ekC.aoM();
    this.jFq = false;
  }

  public final void onResume()
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Boolean.valueOf(this.jFq);
    arrayOfObject[bool] = Boolean.valueOf(this.jFs);
    arrayOfObject[2] = Boolean.valueOf(this.jFr);
    arrayOfObject[3] = Boolean.valueOf(this.jFt);
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpJN/RyYD3u7HIqvfOQFnQw777RTG6BmS5Y=", "dkpno onResume mIsFront:%b  mNeedReCreate:%b mChangedBackground:%b mContactBackground:%b", arrayOfObject);
    this.jFq = bool;
    Time localTime = new Time();
    localTime.setToNow();
    String str = l.a("MM/dd", localTime).toString();
    if (!this.jFx.equals(str));
    while (true)
    {
      this.jFx = str;
      if (bool)
        aYb();
      if ((this.jFs) && (this.jFw != null))
        this.jFs = false;
      if ((this.jFr) || (this.jFt))
      {
        super.a(null, null);
        this.jFr = false;
        this.jFt = false;
      }
      return;
      bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.r
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
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
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.pluginsdk.al;
import com.tencent.mm.pluginsdk.e.l;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.di;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;
import com.tencent.mm.ui.base.dm;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class ab extends com.tencent.mm.ui.n
  implements as
{
  private String dWU;
  protected List edM = null;
  protected di ekA;
  protected dl ekB;
  protected dj ekC = MMSlideDelView.aSu();
  protected dm ekz;
  private boolean fkv = false;
  private boolean fsF = false;
  boolean gCD = false;
  public boolean iJk = false;
  private final int jFA;
  private ColorStateList[] jFh = new ColorStateList[5];
  private HashMap jFi;
  private boolean jFj = true;
  private Typeface jFl;
  private float jFm = -1.0F;
  private float jFn = -1.0F;
  private float jFo = -1.0F;
  private com.tencent.mm.pluginsdk.ui.e jFp;
  private boolean jFs = false;
  private com.tencent.mm.sdk.c.g jFv = null;
  public String jFx = "";
  private final int jFz;
  private ae jGd = null;
  private HashSet jGe;
  private boolean jGf = false;
  private HashSet jGg;
  private boolean jGh = false;
  private boolean jGi = false;
  final ah jGj = new ah(this);
  private float jGk = -1.0F;
  private ad jGl;

  public ab(Context paramContext, q paramq)
  {
    super(paramContext, (byte)0);
    this.TAG = "!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==";
    super.a(paramq);
    this.jFh[0] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Oi);
    this.jFh[1] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Oy);
    this.jFh[3] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.OD);
    this.jFh[2] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Ow);
    this.jFh[2] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Ow);
    this.jFh[4] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Om);
    this.jFA = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.Pp);
    this.jFz = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.Pq);
    this.jFi = new HashMap();
    this.jGe = new HashSet();
    this.jGg = new HashSet();
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

  private static int a(com.tencent.mm.storage.r paramr, ag paramag)
  {
    int i = 1;
    if ((paramr == null) || (paramr.jI() <= 0))
      i = 0;
    while ((y.dG(paramr.getUsername())) || ((paramag.jFO) && (paramag.jFT)) || ((paramag.joG) && (paramag.jFS)))
      return i;
    if (paramr.cw(2097152))
    {
      z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "handleShowTipCnt is enterprise father");
      return i;
    }
    return 2;
  }

  private SparseArray a(com.tencent.mm.ui.r paramr, SparseArray paramSparseArray, HashMap paramHashMap)
  {
    String str = (String)paramr.fa;
    int i = paramSparseArray.size();
    com.tencent.mm.storage.r localr1 = (com.tencent.mm.storage.r)paramr.iIB;
    int j = paramSparseArray.size();
    int k = 0;
    if (k < j)
      if (((String)paramSparseArray.get(k)).equals(str))
      {
        label57: Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = str;
        arrayOfObject[1] = Integer.valueOf(i);
        arrayOfObject[2] = Integer.valueOf(k);
        z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "resortPosition username %s,  size %d, position %d", arrayOfObject);
        switch (paramr.iIA)
        {
        case 3:
        case 4:
        default:
          label132: if (k < 0)
            z.e("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "CursorDataAdapter.CHANGE_TYPE_UPDATE  position < 0");
          break;
        case 5:
        case 2:
        }
      }
    label641: 
    while (true)
    {
      return paramSparseArray;
      k++;
      break;
      k = -1;
      break label57;
      if (k >= 0)
      {
        while (k < i - 1)
        {
          paramSparseArray.put(k, paramSparseArray.get(k + 1));
          k++;
        }
        paramSparseArray.remove(i - 1);
        return paramSparseArray;
        if (localr1 == null)
        {
          z.e("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null");
          if (k >= 0)
          {
            z.e("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "CursorDataAdapter.CHANGE_TYPE_INSERT  cov == null delete it username %s", new Object[] { str });
            while (k < i - 1)
            {
              paramSparseArray.put(k, paramSparseArray.get(k + 1));
              k++;
            }
            paramSparseArray.remove(i - 1);
            return paramSparseArray;
          }
        }
        else
        {
          if (k >= 0)
            break label132;
          for (int m = 0; (m < i) && (a((String)paramSparseArray.get(m), paramHashMap).jP() > localr1.jP()); m++);
          for (int n = i; n > m; n--)
            paramSparseArray.put(n, paramSparseArray.get(n - 1));
          paramSparseArray.put(m, str);
          return paramSparseArray;
          com.tencent.mm.storage.r localr2 = a(str, paramHashMap);
          if (localr1 == null)
          {
            z.e("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "CursorDataAdapter.CHANGE_TYPE_UPDATE  cov == null delete it username %s", new Object[] { str });
            while (k < i - 1)
            {
              paramSparseArray.put(k, paramSparseArray.get(k + 1));
              k++;
            }
            paramSparseArray.remove(i - 1);
            return paramSparseArray;
          }
          long l1 = localr2.jP();
          long l2 = localr1.jP();
          if (l1 != l2)
          {
            int i3;
            int i4;
            int i5;
            int i6;
            if (l1 < l2)
            {
              int i9 = k - 1;
              i3 = 0;
              i4 = i9;
              i5 = 1;
              i6 = i3;
              label485: if (i6 > i4)
                break label637;
              if (a((String)paramSparseArray.get(i6), paramHashMap).jP() > localr1.jP())
                break label584;
            }
            label584: label637: for (int i7 = 1; ; i7 = 0)
            {
              if (i7 == 0)
                break label641;
              if (i5 != 0)
              {
                while (k > i6)
                {
                  paramSparseArray.put(k, paramSparseArray.get(k - 1));
                  k--;
                }
                int i1 = k + 1;
                int i2 = i - 1;
                i3 = i1;
                i4 = i2;
                i5 = 0;
                break;
                i6++;
                break label485;
              }
              int i8 = i6 - 1;
              while (k < i8)
              {
                paramSparseArray.put(k, paramSparseArray.get(k + 1));
                k++;
              }
              i8 = i6;
              paramSparseArray.put(i8, str);
              return paramSparseArray;
            }
          }
        }
      }
    }
  }

  private com.tencent.mm.storage.r a(String paramString, HashMap paramHashMap)
  {
    if ((paramHashMap != null) && (paramHashMap.containsKey(paramString)))
      return (com.tencent.mm.storage.r)paramHashMap.get(paramString);
    return (com.tencent.mm.storage.r)K(paramString);
  }

  private void a(ag paramag)
  {
    if ((paramag.joG) && (paramag.dbG == null))
    {
      paramag.nickName = this.context.getString(com.tencent.mm.n.bAg);
      return;
    }
    paramag.nickName = com.tencent.mm.ar.b.f(this.context, paramag.dbG, (int)this.jGk);
  }

  private void aYb()
  {
    if (this.jFi == null);
    while (true)
    {
      return;
      Iterator localIterator = this.jFi.entrySet().iterator();
      while (localIterator.hasNext())
        ((ag)((Map.Entry)localIterator.next()).getValue()).jFI = null;
    }
  }

  private void aYl()
  {
    if ((this.jFi == null) || (this.jGe == null) || (this.jGe.isEmpty()))
      return;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.jGe.size());
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "dealWithContactEvents contactEvents size %d", arrayOfObject1);
    Iterator localIterator = this.jGe.iterator();
    int i = 0;
    boolean bool3;
    while (true)
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if ((str1 == null) || (str1.equals("")) || (!this.jFi.containsKey(str1)))
          break label343;
        ag localag = (ag)this.jFi.get(str1);
        if (localag == null)
          break label343;
        this.jGj.bJ(str1);
        boolean bool1 = y.dc(str1);
        com.tencent.mm.storage.i locali = this.jGj.aYd();
        if (locali != null)
        {
          String str2 = y.a(locali, str1, bool1);
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = str2;
          arrayOfObject2[1] = localag.dbG;
          z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "dealWithContactEvents newdisplayname %s old dispalyname %s", arrayOfObject2);
          if ((str2 != null) && (!str2.equals(localag.dbG)))
          {
            localag.dbG = str2;
            a(localag);
            i = 1;
          }
          boolean bool2 = locali.zW();
          if (locali.jv() == 0)
          {
            bool3 = true;
            label251: if ((localag.jFO == bool2) && (bool3 == localag.jFS))
              break label343;
            localag.jFO = bool2;
            localag.jFS = bool3;
            localag.jFT = locali.zX();
            z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "dealWithContactEvents in cache username %s mute change", new Object[] { str1 });
          }
        }
      }
    label343: for (int j = 1; ; j = i)
    {
      i = j;
      break;
      bool3 = false;
      break label251;
      if (i != 0)
        notifyDataSetChanged();
      this.jGe.clear();
      return;
    }
  }

  private CharSequence b(com.tencent.mm.storage.r paramr, int paramInt, boolean paramBoolean)
  {
    if ((!com.tencent.mm.platformtools.ap.jb(paramr.jT())) && ((paramr.jU() <= 0) || (paramr.jI() <= 0)))
    {
      SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(this.context.getString(com.tencent.mm.n.bQL));
      localSpannableStringBuilder2.setSpan(new ForegroundColorSpan(-5569532), 0, localSpannableStringBuilder2.length(), 33);
      localSpannableStringBuilder2.append(" ").append(com.tencent.mm.ar.b.d(this.context, paramr.jT(), paramInt));
      return localSpannableStringBuilder2;
    }
    String str1 = paramr.getUsername();
    if (str1.equals("qqmail"))
    {
      if (com.tencent.mm.platformtools.ap.a((Integer)bg.qW().oQ().get(17)) == 1);
      for (int m = 1; m == 0; m = 0)
        return this.context.getString(com.tencent.mm.n.cgr);
    }
    if (str1.equals("tmessage"))
    {
      cj localcj = bg.qW().oY().zX("@t.qq.com");
      if ((localcj != null) && (localcj.aJt()));
      for (int k = 1; k == 0; k = 0)
        return this.context.getString(com.tencent.mm.n.cgr);
    }
    if (str1.equals("qmessage"))
    {
      if ((0x40 & x.pK()) != 0);
      for (int j = 1; j == 0; j = 0)
        return this.context.getString(com.tencent.mm.n.cgr);
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
      str7 = this.context.getString(com.tencent.mm.n.btb);
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
      if ((paramr.jK() != 0) || (!y.dc(paramr.getUsername())))
        break label695;
      str3 = y.u(paramr.jQ(), paramr.getUsername());
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
        SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(this.context.getString(com.tencent.mm.n.bQJ));
        localSpannableStringBuilder1.setSpan(new ForegroundColorSpan(-5569532), 0, localSpannableStringBuilder1.length(), 33);
        localSpannableStringBuilder1.append(" ").append(com.tencent.mm.ar.b.d(this.context, str2, paramInt));
        return localSpannableStringBuilder1;
        str8 = str6 + ": " + str7;
        break;
        label695: str3 = y.dh(paramr.jQ());
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
      int i = com.tencent.mm.n.bQK;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramr.jI());
      arrayOfObject[1] = str2;
      str2 = localContext.getString(i, arrayOfObject);
    }
    return com.tencent.mm.ar.b.d(this.context, str2, paramInt);
  }

  private CharSequence i(com.tencent.mm.storage.r paramr)
  {
    if (paramr.getStatus() == 1)
      return this.context.getString(com.tencent.mm.n.bRf);
    if (paramr.jM() == 9223372036854775807L)
      return "";
    return com.tencent.mm.pluginsdk.e.m.b(this.context, paramr.jM(), true);
  }

  private ag j(com.tencent.mm.storage.r paramr)
  {
    int i = 1;
    String str1 = paramr.getUsername();
    ag localag1 = (ag)this.jFi.get(str1);
    if (localag1 != null)
      return localag1;
    ag localag2 = new ag(this, (byte)0);
    this.jGj.bJ(str1);
    com.tencent.mm.storage.i locali = this.jGj.aYd();
    boolean bool1;
    label90: boolean bool2;
    label113: boolean bool3;
    label136: boolean bool4;
    label178: int j;
    if (locali != null)
    {
      localag2.jFL = locali.jB();
      localag2.Ea = ((int)locali.dhv);
      if (locali == null)
        break label491;
      bool1 = i;
      localag2.jFR = bool1;
      if ((locali == null) || (!locali.zX()))
        break label497;
      bool2 = i;
      localag2.jFT = bool2;
      if ((locali == null) || (locali.jv() != 0))
        break label503;
      bool3 = i;
      localag2.jFS = bool3;
      localag2.joG = y.dc(str1);
      if ((!localag2.joG) || (!localag2.jFS) || (paramr.jI() <= 0))
        break label509;
      bool4 = i;
      localag2.jFQ = bool4;
      localag2.fjl = 0;
      if ((kx(paramr.jN()) == 34) && (paramr.jK() == 0) && (!com.tencent.mm.platformtools.ap.jb(paramr.getContent())))
      {
        String str2 = paramr.getContent();
        if ((str1.equals("qmessage")) || (str1.equals("floatbottle")))
        {
          String[] arrayOfString = str2.split(":");
          if ((arrayOfString != null) && (arrayOfString.length > 3))
            str2 = arrayOfString[i] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
        }
        if (!new bp(str2).BH())
          localag2.fjl = i;
      }
      localag2.dbG = y.a(locali, str1, localag2.joG);
      a(localag2);
      localag2.jFI = i(paramr);
      switch (paramr.getStatus())
      {
      case 3:
      case 4:
      default:
        j = -1;
        label411: localag2.jFK = j;
        localag2.jFM = y.a(paramr);
        bg.qW().oW();
        localag2.jFN = s.g(paramr);
        if ((locali == null) || (!locali.zW()))
          break;
      case 0:
      case 1:
      case 2:
      case 5:
      }
    }
    while (true)
    {
      localag2.jFO = i;
      this.jFi.put(str1, localag2);
      return localag2;
      localag2.jFL = -1;
      localag2.Ea = -1;
      break;
      label491: bool1 = false;
      break label90;
      label497: bool2 = false;
      break label113;
      label503: bool3 = false;
      break label136;
      label509: bool4 = false;
      break label178;
      j = -1;
      break label411;
      j = h.Xb;
      break label411;
      j = -1;
      break label411;
      j = h.WZ;
      break label411;
      i = 0;
    }
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

  public final boolean CT(String paramString)
  {
    return (this.jFi == null) || (!this.jFi.containsKey(paramString));
  }

  public final boolean CU(String paramString)
  {
    if (CT(paramString))
      return false;
    ag localag = (ag)this.jFi.get(paramString);
    if (localag == null)
      return false;
    if (y.dc(paramString))
      return localag.jFS;
    return localag.jFO;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    String str = (String)paramObject;
    int i;
    if ((paramap instanceof s))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = str;
      z.i("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "unreadcheck onConversationStorageNotifyChange event type %d, username %s", arrayOfObject2);
      boolean bool1 = str.contains("@");
      i = 0;
      if (bool1)
      {
        boolean bool2 = str.endsWith("@chatroom");
        i = 0;
        if (!bool2)
        {
          boolean bool3 = str.endsWith("@micromsg.qq.com");
          i = 0;
          if (!bool3)
            break label103;
        }
      }
      if (i == 0);
    }
    label103: 
    do
    {
      do
      {
        do
        {
          return;
          i = 1;
          break;
          if ((paramObject != null) && (this.jFi != null))
            if (paramObject.equals(""))
            {
              if (paramInt == 5)
              {
                this.jGh = true;
                super.i(null, 1);
              }
            }
            else
              this.jGg.add(str);
          if (paramInt == 3)
            paramInt = 2;
          super.i(str, paramInt);
          return;
        }
        while (!(paramap instanceof o));
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Integer.valueOf(paramInt);
        arrayOfObject1[1] = paramObject;
        arrayOfObject1[2] = Boolean.valueOf(this.fkv);
        z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "unreadcheck onContactStorageNotifyChange event type %d, username %s, isIniting %b", arrayOfObject1);
      }
      while (this.fkv);
      this.jGf = true;
    }
    while ((paramInt == 5) || (paramInt == 2) || (this.jFi == null) || (!this.jFi.containsKey(str)) || (this.jGe == null));
    this.jGe.add(str);
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

  public final void a(ae paramae)
  {
    this.jGd = paramae;
  }

  public final SparseArray[] a(HashSet paramHashSet, SparseArray[] paramArrayOfSparseArray)
  {
    if ((paramArrayOfSparseArray == null) || (paramArrayOfSparseArray.length <= 0));
    while (true)
    {
      return paramArrayOfSparseArray;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramHashSet.size());
      arrayOfObject[1] = Integer.valueOf(paramArrayOfSparseArray[0].size());
      z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "refreshPosistion events size %d oldPosistion size %d", arrayOfObject);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = paramHashSet.iterator();
      while (localIterator1.hasNext())
      {
        com.tencent.mm.ui.r localr3 = (com.tencent.mm.ui.r)localIterator1.next();
        if ((localr3 != null) && (localr3.iIA != 5) && (!localArrayList.contains(localr3.fa)))
        {
          z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "searchArray.add(event.object) " + (String)localr3.fa);
          localArrayList.add(localr3.fa);
        }
      }
      HashMap localHashMap1 = new HashMap();
      Cursor localCursor = bg.qW().oW().a(localArrayList, y.dkj, this.edM, com.tencent.mm.h.a.dPB);
      while (localCursor.moveToNext())
      {
        com.tencent.mm.storage.r localr = new com.tencent.mm.storage.r();
        localr.b(localCursor);
        localHashMap1.put(localr.getUsername(), localr);
      }
      localCursor.close();
      Iterator localIterator2 = paramHashSet.iterator();
      while (localIterator2.hasNext())
      {
        com.tencent.mm.ui.r localr2 = (com.tencent.mm.ui.r)localIterator2.next();
        if (localr2 != null)
        {
          if (localr2.iIA != 5)
          {
            StringBuilder localStringBuilder = new StringBuilder("evnet name,").append((String)localr2.fa).append("  event.newObj   ==");
            if (localHashMap1.get(localr2.fa) == null);
            for (boolean bool = true; ; bool = false)
            {
              z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", bool);
              localr2.iIB = localHashMap1.get(localr2.fa);
              break;
            }
          }
          localr2.iIB = null;
        }
      }
      localArrayList.clear();
      localHashMap1.clear();
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator3 = paramHashSet.iterator();
      while (localIterator3.hasNext())
      {
        com.tencent.mm.ui.r localr1 = (com.tencent.mm.ui.r)localIterator3.next();
        if (localr1 != null)
        {
          a(localr1, paramArrayOfSparseArray[0], localHashMap2);
          if (localr1.iIA != 5)
            localHashMap2.put(localr1.fa, localr1.iIB);
        }
      }
    }
  }

  public final com.tencent.mm.dbsupport.newcursor.g aOG()
  {
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "createCursor");
    return (com.tencent.mm.dbsupport.newcursor.g)bg.qW().oW().a(y.dkj, this.edM, com.tencent.mm.h.a.dPB, true);
  }

  public final void aWO()
  {
    boolean bool1 = true;
    if (this.edM == null)
      this.edM = new ArrayList();
    this.edM.clear();
    int i;
    if ((0x8000 & x.pK()) == 0)
    {
      i = bool1;
      boolean bool2 = x.pS();
      if ((i == 0) || (!bool2))
        break label110;
      label53: if (bool1 != this.jGi)
      {
        if (!bool1)
          break label115;
        a(5, bg.qW().oW(), "floatbottle");
      }
    }
    while (true)
    {
      this.jGi = bool1;
      if (this.jGi)
        this.edM.add("floatbottle");
      return;
      i = 0;
      break;
      label110: bool1 = false;
      break label53;
      label115: a(2, bg.qW().oW(), "floatbottle");
    }
  }

  public final void aYe()
  {
    this.jGd = null;
  }

  public final void aYf()
  {
    if (this.jFv == null)
      this.jFv = new ac(this);
    com.tencent.mm.sdk.c.a.aGB().a("BackupResetAccUin", this.jFv);
  }

  public final void aYg()
  {
    if (this.jFv != null)
    {
      com.tencent.mm.sdk.c.a.aGB().b("BackupResetAccUin", this.jFv);
      this.jFv = null;
    }
  }

  public final void aYh()
  {
    super.i(null, 1);
  }

  public final HashSet aYi()
  {
    return this.jGg;
  }

  public final boolean aYj()
  {
    return this.jGh;
  }

  public final void aYk()
  {
    if ((this.jFi == null) || (this.jGg == null) || (this.jGg.isEmpty()))
      return;
    if (this.jGh)
    {
      this.jFi.clear();
      this.jGh = false;
      this.jGg.clear();
      return;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.jGg.size());
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "dealWithConversationEvents size %d", arrayOfObject);
    Iterator localIterator = this.jGg.iterator();
    while (localIterator.hasNext())
      this.jFi.remove(localIterator.next());
    this.jGg.clear();
  }

  public final void aYm()
  {
    this.jGf = false;
  }

  public final boolean aYn()
  {
    return this.jGf;
  }

  public final ArrayList b(ArrayList paramArrayList)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramArrayList.size());
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "rebulidAllChangeData obj.size() %d", arrayOfObject);
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    Cursor localCursor = bg.qW().oW().a(paramArrayList, y.dkj, this.edM, com.tencent.mm.h.a.dPB);
    while (localCursor.moveToNext())
    {
      com.tencent.mm.storage.r localr = new com.tencent.mm.storage.r();
      localr.b(localCursor);
      localArrayList.add(localr);
    }
    localCursor.close();
    return localArrayList;
  }

  public final void b(com.tencent.mm.pluginsdk.ui.e parame)
  {
    this.jFp = parame;
  }

  public final void clearCache()
  {
    if (this.jFi != null)
    {
      this.jFi.clear();
      this.jGh = true;
    }
  }

  public final void fK(boolean paramBoolean)
  {
    this.fkv = paramBoolean;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    this.jGl = new ad(this, (byte)0);
    com.tencent.mm.storage.r localr = (com.tencent.mm.storage.r)cn(paramInt);
    String str = localr.getUsername();
    this.jGj.bJ(str);
    ai localai;
    View localView2;
    ag localag;
    label497: ViewGroup.LayoutParams localLayoutParams;
    label565: label597: label755: lm locallm;
    if (paramView == null)
    {
      localai = new ai();
      View localView1 = View.inflate(this.context, k.bdS, null);
      localai.egy = ((ImageView)localView1.findViewById(com.tencent.mm.i.ahd));
      c.a(localai.egy, str);
      com.tencent.mm.pluginsdk.ui.a locala = (com.tencent.mm.pluginsdk.ui.a)localai.egy.getDrawable();
      if (this.jFp != null)
        this.jFp.a(locala);
      localai.jFW = ((NoMeasuredTextView)localView1.findViewById(com.tencent.mm.i.aGn));
      localai.jFX = ((NoMeasuredTextView)localView1.findViewById(com.tencent.mm.i.aTY));
      localai.jFY = ((NoMeasuredTextView)localView1.findViewById(com.tencent.mm.i.azM));
      localai.ekI = ((TextView)localView1.findViewById(com.tencent.mm.i.aST));
      localai.jFZ = ((ImageView)localView1.findViewById(com.tencent.mm.i.ayi));
      localai.jGc = localView1.findViewById(com.tencent.mm.i.ahf);
      localai.jGa = ((ImageView)localView1.findViewById(com.tencent.mm.i.aSx));
      localai.jGb = ((ImageView)localView1.findViewById(com.tencent.mm.i.aAN));
      localai.jGv = new af(this);
      localView1.setTag(localai);
      localai.jFY.ac(this.jFn);
      localai.jFX.ac(this.jFo);
      localai.jFW.ac(this.jFm);
      this.jGk = localai.jFW.getTextSize();
      localai.jFY.setTextColor(this.jFh[0]);
      localai.jFX.setTextColor(this.jFh[4]);
      localai.jFW.setTextColor(this.jFh[3]);
      localai.jFY.eZ(true);
      localai.jFX.eZ(false);
      localai.jFW.eZ(true);
      localai.jFX.aTn();
      localai.jFW.setTypeface(this.jFl);
      localView2 = localView1;
      localag = j(localr);
      if (localag.jFJ == null)
      {
        int m = (int)localai.jFY.getTextSize();
        localag.jFJ = b(localr, m, localag.jFQ);
      }
      if (localag.jFI == null)
        localag.jFI = i(localr);
      if (!localag.jFQ)
        break label1124;
      localai.jFY.setTextColor(this.jFh[0]);
      com.tencent.mm.booter.notification.a.m.bV(localai.jFY.getWidth());
      com.tencent.mm.booter.notification.a.m.bW((int)localai.jFY.getTextSize());
      com.tencent.mm.booter.notification.a.m.a(localai.jFY.getPaint());
      if (!str.toLowerCase().endsWith("@t.qq.com"))
        break label1145;
      localai.jFW.pO(h.VU);
      localai.jFW.eY(true);
      int i = localag.jFK;
      if (i == -1)
        break label1157;
      localai.jFY.pN(i);
      localai.jFY.eX(true);
      localai.jFW.setText(localag.nickName);
      localLayoutParams = localai.jFX.getLayoutParams();
      if (localag.jFI.length() < 9)
        break label1169;
      if (localLayoutParams.width != this.jFA)
      {
        localLayoutParams.width = this.jFA;
        localai.jFX.setLayoutParams(localLayoutParams);
      }
      label666: Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(localLayoutParams.width);
      z.v("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "layout update time  width %d", arrayOfObject);
      localai.jFX.setText(localag.jFI);
      localai.jFY.setText(localag.jFJ);
      localai.jFZ.setVisibility(8);
      if (!localag.joG)
        break label1203;
      if (localag.jFS)
        localai.jFZ.setVisibility(0);
      c.a(localai.egy, str);
      if (this.jFj)
      {
        if ((localr != null) && (localai != null) && (localag != null))
          break label1223;
        z.w("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "handle show tip cnt, but conversation or viewholder is null");
      }
      label800: if ((!localag.jFM) && (localag.jFN) && (bg.oE()))
        bg.qW().oW().f(localr);
      if ((!localag.jFN) || (localr.jM() == -1L))
        break label1440;
      localView2.findViewById(com.tencent.mm.i.aoT).setBackgroundResource(h.Ui);
      label868: com.tencent.mm.am.a.aCl();
      locallm = new lm();
      locallm.cOG.cOI = true;
      com.tencent.mm.sdk.c.a.aGB().g(locallm);
      if ((0L != s.a(localr, 7, 0L)) && (!localr.getUsername().equals(locallm.cOH.cOK)))
      {
        localr.l(s.a(localr, 6, localr.jM()));
        bg.qW().oW().a(localr, localr.getUsername());
      }
      if ((com.tencent.mm.pluginsdk.g.axT() != null) && (com.tencent.mm.pluginsdk.g.axT().sU(localr.getUsername())))
        break label1457;
      localai.jGa.setVisibility(8);
      label999: if ((com.tencent.mm.pluginsdk.g.aya() == null) || (!com.tencent.mm.pluginsdk.g.aya().nR(localr.getUsername())))
        break label1513;
      localai.jGb.setVisibility(0);
    }
    while (true)
    {
      this.jGl.content = String.valueOf(localag.jFJ);
      this.jGl.dkB = localag.dbG;
      this.jGl.jFH = String.valueOf(localag.jFI);
      ad localad = this.jGl;
      com.tencent.mm.ui.a.a.aQs().a(localView2, localad.dkB, localad.jFG, localad.jFH, localad.content);
      return localView2;
      localai = (ai)paramView.getTag();
      localView2 = paramView;
      break;
      label1124: localai.jFY.setTextColor(this.jFh[localag.fjl]);
      break label497;
      label1145: localai.jFW.eY(false);
      break label565;
      label1157: localai.jFY.eX(false);
      break label597;
      label1169: if (localLayoutParams.width == this.jFz)
        break label666;
      localLayoutParams.width = this.jFz;
      localai.jFX.setLayoutParams(localLayoutParams);
      break label666;
      label1203: if (!localag.jFO)
        break label755;
      localai.jFZ.setVisibility(0);
      break label755;
      label1223: localai.ekI.setVisibility(4);
      localai.jGc.setVisibility(4);
      NoMeasuredTextView localNoMeasuredTextView = localai.jFW;
      if ((localag.jFR) && (localag.jFL == 1));
      for (ColorStateList localColorStateList = this.jFh[2]; ; localColorStateList = this.jFh[3])
      {
        localNoMeasuredTextView.setTextColor(localColorStateList);
        if ((localag.jFR) && (localag.Ea != 0))
          break label1318;
        z.w("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "handle show tip count, but talker is null");
        break;
      }
      label1318: int j = a(localr, localag);
      if (j == 1)
      {
        localai.jGc.setVisibility(0);
        break label800;
      }
      if (j != 2)
        break label800;
      int k = localr.jI();
      if (k > 100)
      {
        localai.ekI.setText(com.tencent.mm.n.cmN);
        localai.ekI.setVisibility(0);
      }
      while (true)
      {
        this.jGl.jFG = k;
        break;
        if (k > 0)
        {
          localai.ekI.setText(localr.jI());
          localai.ekI.setVisibility(0);
        }
      }
      label1440: localView2.findViewById(com.tencent.mm.i.aoT).setBackgroundResource(h.Uj);
      break label868;
      label1457: localai.jGa.setVisibility(0);
      if (localr.getUsername().equals(locallm.cOH.cOK))
      {
        localai.jGa.setImageResource(h.abO);
        break label999;
      }
      localai.jGa.setImageResource(h.abM);
      break label999;
      label1513: localai.jGb.setVisibility(8);
    }
  }

  public final void jI(String paramString)
  {
    this.dWU = paramString.trim();
    if ((this.dWU != null) && (this.dWU.length() > 0));
    for (this.fsF = true; ; this.fsF = false)
    {
      i(null, 1);
      return;
    }
  }

  public final void onDestroy()
  {
    this.jGd = null;
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
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "unreadcheck adpter onPause  hasResume " + this.iJk);
    if (!this.iJk);
    do
    {
      return;
      this.iJk = false;
      super.pause();
    }
    while (this.ekC == null);
    this.ekC.aoM();
  }

  public final void onResume()
  {
    z.d("!56@/B4Tb64lLpJN/RyYD3u7HHFODEXOcSgoS8i/ur/RymA86PQsHMX31w==", "unreadcheck adpter onResume  hasResume " + this.iJk);
    if (this.iJk)
      return;
    this.iJk = true;
    aWO();
    aYl();
    super.aOK();
    Time localTime = new Time();
    localTime.setToNow();
    String str = l.a("MM/dd", localTime).toString();
    if (!this.jFx.equals(str));
    for (int i = 1; ; i = 0)
    {
      this.jFx = str;
      if (i != 0)
        aYb();
      if ((!this.jFs) || (this.jGd == null))
        break;
      this.jGd.aYo();
      this.jFs = false;
      super.i(null, 1);
      return;
    }
  }

  public final boolean op()
  {
    return super.op();
  }

  public final void qD(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getCount()));
    com.tencent.mm.storage.r localr;
    do
    {
      return;
      localr = (com.tencent.mm.storage.r)cn(paramInt);
    }
    while (localr == null);
    c.azD().ao(localr.getUsername());
  }

  public final int z(int paramInt, boolean paramBoolean)
  {
    int i = getCount();
    if (i <= 0)
      return -1;
    for (int j = Math.abs((paramInt + 1) % i); j != paramInt; j = (j + 1) % i)
    {
      com.tencent.mm.storage.r localr = (com.tencent.mm.storage.r)cn(j);
      if ((localr != null) && (localr.jI() > 0))
        if (paramBoolean)
        {
          if (a(localr, j(localr)) == 2)
            return j;
        }
        else
          return j;
    }
    return -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ab
 * JD-Core Version:    0.6.2
 */
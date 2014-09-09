package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.dbsupport.newcursor.g;
import com.tencent.mm.f;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.q.v;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.di;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;
import com.tencent.mm.ui.base.dm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a extends com.tencent.mm.ui.n
  implements as
{
  public static final ColorStateList feQ = com.tencent.mm.aq.a.m(ak.getContext(), f.Ou);
  public static final ColorStateList feR = com.tencent.mm.aq.a.m(ak.getContext(), f.Oi);
  private String dWU = "";
  private com.tencent.mm.ui.applet.b dtE = null;
  View.OnClickListener eRh = new b(this);
  private boolean eTA = false;
  protected List edM = null;
  protected di ekA;
  protected dj ekC = MMSlideDelView.aSu();
  protected dm ekz;
  protected dl frR;
  private String[] jmD = null;
  public HashMap jwX = new HashMap();
  protected String jwY = null;
  protected String jxa = null;
  private List jxb;
  private List jxc;
  private int jxd = 0;
  protected int[] jxe;
  private String[] jxf;
  protected e jxg;
  private Set jxh = new HashSet();
  private int jxi = 0;
  private boolean jxj = true;
  private c jxk;
  private boolean jxl = false;
  private boolean jxm = false;
  private String jxn;
  private LinkedList jxo = new LinkedList();
  private boolean jxp;
  private HashMap jxq = new HashMap();
  private SparseArray jxr = new SparseArray();
  private SparseArray jxs = new SparseArray();
  private HashSet jxt = new HashSet();
  StringBuilder sb = new StringBuilder(32);
  private int type;

  public a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    super(paramContext);
    this.context = paramContext;
    this.jwY = paramString1;
    this.jxa = paramString2;
    this.type = paramInt;
    this.jxl = true;
    this.jxb = new LinkedList();
    this.jxc = new LinkedList();
    this.jxn = x.pG();
    this.TAG = "MiscroMsg.AddressDrawWithCacheAdapter";
  }

  private int a(com.tencent.mm.storage.a parama, int paramInt)
  {
    if (paramInt < this.jxi)
      return 32;
    return parama.field_showHead;
  }

  private boolean aWK()
  {
    return (this.jwY.equals("@micromsg.qq.com")) || (this.jwY.equals("@all.contact.without.chatroom"));
  }

  private String b(com.tencent.mm.storage.a parama, int paramInt)
  {
    String str1;
    if (paramInt < this.jxi)
      str1 = getString(com.tencent.mm.n.bsg);
    do
    {
      return str1;
      if (parama.field_showHead == 31)
        return "";
      if (parama.field_showHead == 123)
        return "#";
      if (parama.field_showHead == 33)
        return getString(com.tencent.mm.n.brS);
      if (parama.field_showHead == 43)
        return getString(com.tencent.mm.n.caw);
      if (parama.field_showHead == 32)
        return getString(com.tencent.mm.n.bsg);
      str1 = (String)this.jxr.get(parama.field_showHead);
    }
    while (str1 != null);
    String str2 = String.valueOf((char)parama.field_showHead);
    this.jxr.put(parama.field_showHead, str2);
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

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    if (paramap == bg.qW().oT())
    {
      if ((!y.df((String)paramObject)) && (!this.jxt.contains((String)paramObject)))
        super.i((String)paramObject, 2);
    }
    else
      return;
    z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "newcursor is stranger ，return");
  }

  public final void a(di paramdi)
  {
    this.ekA = paramdi;
  }

  public final void a(dl paramdl)
  {
    this.frR = paramdl;
  }

  public final void a(dm paramdm)
  {
    this.ekz = paramdm;
  }

  public final void a(c paramc)
  {
    this.jxk = paramc;
  }

  public final SparseArray[] a(HashSet paramHashSet, SparseArray[] paramArrayOfSparseArray)
  {
    SparseArray[] arrayOfSparseArray = new SparseArray[paramArrayOfSparseArray.length];
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("weixin");
    long l = System.currentTimeMillis();
    Cursor localCursor = bg.qW().oT().b(this.jwY, this.jxa, this.edM, localLinkedList, aWK(), this.jxl);
    if ((localCursor instanceof com.tencent.mm.dbsupport.newcursor.h))
    {
      g[] arrayOfg = ((com.tencent.mm.dbsupport.newcursor.h)localCursor).Cd();
      int j = arrayOfg.length;
      for (int k = 0; k < j; k++)
      {
        arrayOfg[k].cs(5000);
        arrayOfSparseArray[k] = new SparseArray();
        for (int m = 0; arrayOfg[k].moveToNext(); m++)
          arrayOfSparseArray[k].put(m, arrayOfg[k].getString(0));
      }
      this.jxi = arrayOfg[0].getCount();
    }
    while (true)
    {
      localCursor.close();
      z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "refreshPosistion last :" + (System.currentTimeMillis() - l));
      return arrayOfSparseArray;
      arrayOfSparseArray[0] = new SparseArray();
      for (int i = 0; localCursor.moveToNext(); i++)
        arrayOfSparseArray[0].put(i, localCursor.getString(0));
    }
  }

  public final g aOG()
  {
    long l = System.currentTimeMillis();
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("weixin");
    Cursor localCursor = bg.qW().oT().a(this.jwY, this.jxa, this.edM, localLinkedList, aWK(), this.jxl);
    z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "kevin setCursor : " + (System.currentTimeMillis() - l));
    return (g)localCursor;
  }

  public final void aWI()
  {
    this.jxm = true;
  }

  public final String[] aWJ()
  {
    z.v("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "getSections");
    return this.jxf;
  }

  protected final void aWL()
  {
    int i = getCount();
    if (i == 0)
      return;
    this.jxi = aOF();
    if (this.jmD != null)
    {
      this.jxe = y.a(this.jwY, this.jxa, this.edM, this.jmD);
      this.jxf = y.a(this.jwY, this.jxa, this.jmD, this.edM);
    }
    while (true)
    {
      this.jxh.clear();
      for (int m : this.jxe)
        this.jxh.add(Integer.valueOf(m - 1));
      break;
      if (op())
      {
        long l2 = System.currentTimeMillis();
        HashSet localHashSet = new HashSet();
        this.jxe = new int[30];
        this.jxf = new String[30];
        int n = this.jxi;
        int i1 = 0;
        if (n < i)
        {
          com.tencent.mm.storage.a locala = (com.tencent.mm.storage.a)cn(n);
          if (locala != null)
          {
            String str = b(locala, n);
            if (!localHashSet.add(str))
              break label268;
            this.jxe[i1] = (n - this.jxi);
            this.jxf[i1] = str;
          }
          label268: for (int i2 = i1 + 1; ; i2 = i1)
          {
            n++;
            i1 = i2;
            break;
            z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "newCursor getItem is null");
          }
        }
        z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "newCursor resetShowHead by Memory : " + (System.currentTimeMillis() - l2) + "favourCount : " + this.jxi);
      }
      else
      {
        long l1 = System.currentTimeMillis();
        this.jxe = y.a(this.jwY, this.jxa, this.edM, this.dWU);
        this.jxf = y.a(this.jwY, this.jxa, this.dWU, this.edM);
        z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "kevin resetShowHead part1 : " + (System.currentTimeMillis() - l1));
      }
    }
  }

  public final void aWM()
  {
    this.ekC.aoN();
  }

  public final void aWN()
  {
    super.i(null, 1);
  }

  public final void av(String paramString, int paramInt)
  {
    if (paramInt == 5)
      this.jxt.add(paramString);
    super.i(paramString, paramInt);
  }

  public final ArrayList b(ArrayList paramArrayList)
  {
    long l = System.currentTimeMillis();
    ArrayList localArrayList1 = new ArrayList();
    for (int i = 0; i < paramArrayList.size(); i++)
      localArrayList1.add((String)paramArrayList.get(i));
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    Cursor localCursor = bg.qW().oT().aJ(localArrayList1);
    while (localCursor.moveToNext())
    {
      com.tencent.mm.storage.a locala = new com.tencent.mm.storage.a();
      locala.b(localCursor);
      localArrayList2.add(locala);
    }
    localCursor.close();
    z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "rebulidAllChangeData :" + (System.currentTimeMillis() - l));
    return localArrayList2;
  }

  public final void bc(List paramList)
  {
    if (this.edM == null)
      this.edM = new LinkedList();
    this.edM.clear();
    this.edM.addAll(paramList);
    if (this.type != 2)
      this.edM.add(x.pG());
    cj localcj = bg.qW().oY().zX("@t.qq.com");
    if (localcj != null)
      this.edM.add(localcj.getName());
    if ((this.type == 3) || (this.type == 5) || (this.type == 4) || (this.type == 1) || (this.type == 0))
    {
      Iterator localIterator = y.qj().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.edM.add(str);
      }
    }
    this.edM.add("blogapp");
  }

  public final void clearCache()
  {
    this.jxq.clear();
    this.jxo.clear();
    this.jxp = false;
  }

  public final void d(String paramString, String[] paramArrayOfString)
  {
    this.jxj = true;
    String str = paramString.trim();
    if (str.startsWith("@"))
      if ((this.jwY == null) || (this.jwY.length() <= 0))
        break label115;
    label115: for (str = str.substring(1) + "%" + this.jwY; ; str = str.substring(1) + "%@t.qq.com")
    {
      z.d("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "dkvoice [" + str + "]");
      this.dWU = str;
      this.jmD = null;
      av(null, 0);
      return;
    }
  }

  public final void detach()
  {
    if (this.dtE != null)
    {
      this.dtE.detach();
      this.dtE = null;
    }
  }

  public final void fv(boolean paramBoolean)
  {
    this.eTA = paramBoolean;
  }

  public final int getCount()
  {
    return super.getCount();
  }

  public final int getPositionForSection(int paramInt)
  {
    if ((this.jxe != null) && (paramInt >= 0) && (paramInt < this.jxe.length))
      paramInt = this.jxe[paramInt];
    return paramInt + this.jxi;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = -1;
    if (!this.jxp)
    {
      for (int m = 0; m < 8; m++)
        this.jxo.add(View.inflate(this.context, k.baG, null));
      this.jxp = true;
    }
    com.tencent.mm.storage.a locala1 = (com.tencent.mm.storage.a)cn(paramInt);
    View localView1;
    d locald;
    label209: com.tencent.mm.storage.a locala2;
    com.tencent.mm.storage.a locala3;
    int j;
    label242: int k;
    label256: label303: label328: CharSequence localCharSequence1;
    if (paramView == null)
      if (this.jxo.size() > 0)
      {
        View localView2 = (View)this.jxo.getFirst();
        this.jxo.removeFirst();
        localView1 = localView2;
        locald = new d();
        locald.egz = ((TextView)localView1.findViewById(i.aoA));
        locald.jxv = ((TextView)localView1.findViewById(i.aoH));
        locald.feV = ((AddressView)localView1.findViewById(i.aFu));
        locald.jxw = ((TextView)localView1.findViewById(i.aox));
        locald.jxx = localView1.findViewById(i.aoG);
        this.jxg.eue.a(locald.feV);
        localView1.setTag(locald);
        paramView = localView1;
        locala2 = (com.tencent.mm.storage.a)cn(paramInt - 1);
        locala3 = (com.tencent.mm.storage.a)cn(paramInt + 1);
        if (locala2 != null)
          break label676;
        j = i;
        k = a(locala1, paramInt);
        if (locala3 != null)
          break label690;
        if (!this.jxj)
          break label754;
        if (paramInt != 0)
          break label704;
        String str4 = b(locala1, paramInt);
        if (com.tencent.mm.platformtools.ap.jb(str4))
          break label754;
        locald.egz.setVisibility(0);
        locald.egz.setText(str4);
        if ((!this.jxj) || (k == i))
          break label767;
        locald.jxx.setBackgroundResource(com.tencent.mm.h.Uk);
        com.tencent.mm.pluginsdk.ui.c.a(locald.feV, locala1.getUsername());
        if (locala1.jd() == 0)
          break label793;
        String str2 = at.qz().cJ(locala1.jd());
        if (str2 == null)
          break label781;
        Bitmap localBitmap = v.fJ(str2);
        locald.feV.setMaskBitmap(localBitmap);
        label386: if (locala1.field_deleteFlag != 1)
          break label805;
        locald.feV.setNickNameTextColor(feR);
        label406: localCharSequence1 = locala1.aHW();
        if (localCharSequence1 != null)
          break label834;
      }
    while (true)
    {
      try
      {
        Context localContext = this.context;
        locala1.getUsername();
        Object localObject2 = locala1.od();
        String str1 = locala1.getUsername();
        if ((localObject2 != null) && (((String)localObject2).length() > 0))
        {
          if (("".length() > 0) && (!"".equals(localObject2)))
          {
            this.sb.append((String)localObject2);
            this.sb.append("(");
            this.sb.append("");
            this.sb.append(")");
            localObject2 = this.sb.toString();
            this.sb.delete(0, this.sb.length());
          }
          CharSequence localCharSequence2 = com.tencent.mm.ar.b.f(localContext, (String)localObject2, (int)locald.feV.getNickNameSize());
          localObject1 = localCharSequence2;
          if (localObject1 == null)
            localObject1 = "";
          locald.feV.setName((CharSequence)localObject1);
          locald.feV.setDescription(com.tencent.mm.platformtools.ap.ja(locala1.field_remarkDesc));
          locald.feV.updatePositionFlag();
          if (locala1.field_deleteFlag != 1)
            break label847;
          locald.jxw.setVisibility(0);
          locald.feV.setContentDescription(locald.feV.getNickName().toString());
          return paramView;
          localView1 = View.inflate(this.context, k.baG, null);
          break;
          locald = (d)paramView.getTag();
          break label209;
          label676: j = a(locala2, paramInt - 1);
          break label242;
          label690: i = a(locala3, paramInt + 1);
          break label256;
          label704: if ((paramInt > 0) && (k != j))
          {
            String str3 = b(locala1, paramInt);
            if (!com.tencent.mm.platformtools.ap.jb(str3))
            {
              locald.egz.setVisibility(0);
              locald.egz.setText(str3);
              break label303;
            }
          }
          label754: locald.egz.setVisibility(8);
          break label303;
          label767: locald.jxx.setBackgroundResource(com.tencent.mm.h.Wf);
          break label328;
          label781: locald.feV.setMaskBitmap(null);
          break label386;
          label793: locald.feV.setMaskBitmap(null);
          break label386;
          label805: locald.feV.setNickNameTextColor(feQ);
          break label406;
        }
        localObject2 = str1;
        continue;
      }
      catch (Exception localException)
      {
        Object localObject1 = null;
        continue;
      }
      label834: locald.feV.setName(localCharSequence1);
      continue;
      label847: locald.jxw.setVisibility(8);
    }
  }

  public final void k(Fragment paramFragment)
  {
    this.jxg = ((e)paramFragment);
  }

  public final void notifyDataSetChanged()
  {
    this.jxn = x.pG();
    if (this.jxe == null)
      aWL();
    if (getCount() == 0)
      return;
    this.jxi = aOF();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.jxi);
    z.i("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "newcursor favourCount %d", arrayOfObject);
    super.notifyDataSetChanged();
  }

  public final void pause()
  {
    this.jxt.clear();
    super.pause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a
 * JD-Core Version:    0.6.2
 */
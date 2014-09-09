package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.v;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class fq extends cb
{
  private String dWU = "";
  protected List edM = null;
  private int gnD = 2147483647;
  private int[] jAD;
  private ColorStateList jCp;
  private ColorStateList jCq;
  private String jCr = "";
  private int jCs = 0;
  private int jCt = 2147483647;
  protected String jwY = null;
  protected String jxa = null;
  private List jxb;
  private int jxd = 0;
  private int[] jxe;
  private String[] jxf;

  public fq(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    super(paramContext, new com.tencent.mm.storage.i());
    this.jwY = paramString1;
    this.jxa = paramString2;
    this.jCr = paramString3;
    this.jxb = new LinkedList();
    this.jCp = a.m(paramContext, f.Ou);
    this.jCq = a.m(paramContext, f.Ov);
  }

  private boolean CJ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return true;
    if (y.e(aXJ()))
    {
      Iterator localIterator = this.jxb.iterator();
      boolean bool = localIterator.hasNext();
      fr localfr = null;
      if (bool)
        localfr = (fr)localIterator.next();
      if (localfr != null)
      {
        Context localContext1 = this.context;
        Context localContext2 = this.context;
        int i = n.bKq;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = bg.qW().oT().ys(localfr.cDi).od();
        e.o(localContext1, localContext2.getString(i, arrayOfObject), this.context.getString(n.buo));
      }
      return false;
    }
    if ((x.cY(paramString)) && (this.jxb.size() == 0))
    {
      e.b(this.context, n.bPA, n.buo);
      return false;
    }
    if ((aXJ().size() > 0) && (!y.db(paramString)) && (!y.de(paramString)))
    {
      e.o(this.context, this.context.getString(n.caJ), this.context.getString(n.buo));
      return false;
    }
    return true;
  }

  private fr CK(String paramString)
  {
    Object localObject1 = null;
    Iterator localIterator = this.jxb.iterator();
    Object localObject2;
    if (localIterator.hasNext())
    {
      localObject2 = (fr)localIterator.next();
      if (!((fr)localObject2).cDi.equals(paramString))
        break label52;
    }
    while (true)
    {
      localObject1 = localObject2;
      break;
      return localObject1;
      label52: localObject2 = localObject1;
    }
  }

  private int a(int paramInt, com.tencent.mm.storage.i parami)
  {
    if (paramInt < this.jCs)
      return 0;
    return parami.jc();
  }

  private List aXJ()
  {
    LinkedList localLinkedList = new LinkedList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = this.jxb.iterator();
    while (localIterator1.hasNext())
    {
      fr localfr = (fr)localIterator1.next();
      z.d("!44@/B4Tb64lLpLI3JJoWXimvQoxbWlDtRqESD+7pzVdfz0=", "selectedContact.userName" + localfr.cDi);
      if (y.de(localfr.cDi))
      {
        List localList = v.cV(localfr.cDi);
        if (localList != null)
        {
          Iterator localIterator2 = localList.iterator();
          while (localIterator2.hasNext())
          {
            String str = (String)localIterator2.next();
            if (!localHashSet.contains(str))
            {
              localLinkedList.add(str);
              localHashSet.add(str);
            }
          }
        }
      }
      else if (!localHashSet.contains(localfr.cDi))
      {
        localLinkedList.add(localfr.cDi);
        localHashSet.add(localfr.cDi);
      }
    }
    return localLinkedList;
  }

  private String b(int paramInt, com.tencent.mm.storage.i parami)
  {
    if (paramInt == this.gnD)
      return this.context.getString(n.bsg);
    if ((this.jCt != 2147483647) && (paramInt < this.jCt))
      return null;
    if (parami.jc() == 123)
      return "#";
    if (parami.jc() == 33)
      return this.context.getString(n.cgp);
    if (parami.jc() == 43)
      return this.context.getString(n.caw);
    if (parami.jc() == 32)
      return this.context.getString(n.bsg);
    return String.valueOf((char)parami.jc());
  }

  public final void CI(String paramString)
  {
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(paramString);
    fr localfr;
    if (locali != null)
    {
      localfr = CK(locali.getUsername());
      if (localfr != null)
        break label74;
      String str = locali.getUsername();
      locali.od();
      if (CJ(str))
        this.jxb.add(new fr(locali.getUsername()));
    }
    while (true)
    {
      notifyDataSetChanged();
      return;
      label74: this.jxb.remove(localfr);
    }
  }

  public final void DW()
  {
    int i = 0;
    ch.b(this.jCr.split(";"));
    this.gnD = 2147483647;
    label109: int j;
    if ((this.dWU == null) || (this.dWU.length() <= 0))
    {
      Cursor localCursor = bg.qW().oT().d(this.edM, false);
      if (localCursor.getCount() > 0)
      {
        this.jCt = localCursor.getCount();
        this.gnD = 0;
        setCursor(bg.qW().oT().a(this.jwY, this.jxa, this.edM, true));
        this.jCs = 0;
        this.jxe = y.a(this.jwY, this.jxa, this.edM, this.dWU);
        this.jxf = y.a(this.jwY, this.jxa, this.dWU, this.edM);
        this.jAD = null;
        if (this.jxe == null)
          break label365;
        z.d("!44@/B4Tb64lLpLI3JJoWXimvQoxbWlDtRqESD+7pzVdfz0=", "reset : showSection = " + this.jxf.length + " secPos = " + this.jxe.length + " count = " + getCount());
        if (getCount() <= 0)
          break label346;
        j = getCount();
        label233: this.jAD = new int[j];
      }
    }
    while (true)
    {
      if (i >= this.jxe.length)
        break label365;
      if (i < -1 + this.jxe.length);
      for (int k = this.jxe[(i + 1)]; ; k = j)
      {
        for (int m = this.jxe[i]; m < k; m++)
          this.jAD[m] = i;
        this.gnD = 2147483647;
        break;
        setCursor(bg.qW().oT().d(this.dWU, this.jwY, this.jxa, this.edM));
        this.jCs = 0;
        break label109;
        label346: j = 0;
        break label233;
      }
      i++;
    }
    label365: if (this.iLp != null)
      this.iLp.DT();
    notifyDataSetChanged();
  }

  protected final void DX()
  {
    closeCursor();
    DW();
  }

  public final String[] aWJ()
  {
    z.v("!44@/B4Tb64lLpLI3JJoWXimvQoxbWlDtRqESD+7pzVdfz0=", "getSections");
    return this.jxf;
  }

  public final int aXK()
  {
    if (this.jxb != null)
      return this.jxb.size();
    return 0;
  }

  public final int aXL()
  {
    return this.jCs;
  }

  public final boolean aXx()
  {
    return this.jxb.size() >= 0;
  }

  public final List aXy()
  {
    LinkedList localLinkedList = new LinkedList();
    HashSet localHashSet = new HashSet();
    localHashSet.add(x.pG());
    for (int i = 0; i < this.jxd; i++)
      localHashSet.add(((fr)this.jxb.get(i)).cDi);
    for (int j = this.jxd; j < this.jxb.size(); j++)
    {
      String str1 = ((fr)this.jxb.get(j)).cDi;
      if (y.de(str1))
      {
        List localList = v.cV(str1);
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            if (!localHashSet.contains(str2))
            {
              localLinkedList.add(str2);
              localHashSet.add(str2);
            }
          }
        }
      }
      else if (!localHashSet.contains(str1))
      {
        localLinkedList.add(str1);
        localHashSet.add(str1);
      }
    }
    return localLinkedList;
  }

  public final void bc(List paramList)
  {
    if (paramList == null)
      paramList = new LinkedList();
    this.edM = paramList;
    this.edM.add(x.pG());
    cj localcj = bg.qW().oY().zX("@t.qq.com");
    if (localcj != null)
      this.edM.add(localcj.getName());
    Iterator localIterator = y.qj().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.edM.add(str);
    }
    a(null, null);
  }

  public final void bg(List paramList)
  {
    this.jxb.clear();
    com.tencent.mm.storage.i locali = x.qh();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.equals(locali.getUsername()))
        this.jxb.add(new fr(locali.getUsername()));
      else
        this.jxb.add(new fr(str));
    }
    a(null, null);
  }

  public final int getCount()
  {
    return getCursor().getCount();
  }

  public final int getPositionForSection(int paramInt)
  {
    if ((this.jxe != null) && (paramInt >= 0) && (paramInt < this.jxe.length))
      paramInt = this.jxe[paramInt];
    return paramInt + this.jCs;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    fs localfs1;
    com.tencent.mm.storage.i locali1;
    int i;
    label130: com.tencent.mm.storage.i locali2;
    label180: ColorStateList localColorStateList;
    label204: boolean bool;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bdB, null);
      fs localfs2 = new fs();
      localfs2.egz = ((TextView)paramView.findViewById(com.tencent.mm.i.aoA));
      localfs2.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aoy));
      localfs2.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
      localfs2.egC = ((CheckBox)paramView.findViewById(com.tencent.mm.i.aoE));
      localfs2.jAE = ((TextView)paramView.findViewById(com.tencent.mm.i.aow));
      paramView.setTag(localfs2);
      localfs1 = localfs2;
      locali1 = (com.tencent.mm.storage.i)getItem(paramInt - 1);
      if (locali1 != null)
        break label338;
      i = -1;
      locali2 = (com.tencent.mm.storage.i)getItem(paramInt);
      if (paramInt != 0)
        break label352;
      localfs1.egz.setVisibility(0);
      localfs1.egz.setText(b(paramInt, locali2));
      localfs1.egz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      TextView localTextView1 = localfs1.egA;
      if (y.dP(locali2.getUsername()))
        break label430;
      localColorStateList = this.jCp;
      localTextView1.setTextColor(localColorStateList);
      localfs1.egC.setVisibility(0);
      CheckBox localCheckBox = localfs1.egC;
      if (CK(locali2.getUsername()) == null)
        break label439;
      bool = true;
      label242: localCheckBox.setChecked(bool);
      if (!this.jwY.equals("@domain.android"))
        break label445;
      localfs1.eoy.setVisibility(8);
      localfs1.jAE.setText(locali2.getUsername());
    }
    while (true)
    {
      TextView localTextView2 = localfs1.egA;
      localTextView2.setText(com.tencent.mm.ar.b.g(this.context, locali2.od(), (int)localfs1.egA.getTextSize()));
      return paramView;
      localfs1 = (fs)paramView.getTag();
      break;
      label338: i = a(paramInt - 1, locali1);
      break label130;
      label352: if ((paramInt > 0) && (a(paramInt, locali2) != i) && (b(paramInt, locali2) != null))
      {
        localfs1.egz.setVisibility(0);
        localfs1.egz.setText(b(paramInt, locali2));
        localfs1.egz.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        break label180;
      }
      localfs1.egz.setVisibility(8);
      break label180;
      label430: localColorStateList = this.jCq;
      break label204;
      label439: bool = false;
      break label242;
      label445: c.a((ImageView)localfs1.eoy.getContentView(), locali2.getUsername(), true);
      localfs1.jAE.setVisibility(8);
    }
  }

  public final void jI(String paramString)
  {
    String str = paramString.trim();
    if (str.startsWith("@"))
      if ((this.jwY == null) || (this.jwY.length() <= 0))
        break label78;
    label78: for (str = str.substring(1) + "%" + this.jwY; ; str = str.substring(1) + "%@t.qq.com")
    {
      this.dWU = str;
      closeCursor();
      DW();
      return;
    }
  }

  public final void qx(int paramInt)
  {
    com.tencent.mm.storage.i locali = (com.tencent.mm.storage.i)getItem(paramInt);
    fr localfr = CK(locali.getUsername());
    if (localfr == null)
    {
      String str = locali.getUsername();
      locali.od();
      if (!CJ(str))
        return;
      this.jxb.add(new fr(locali.getUsername()));
    }
    while (true)
    {
      notifyDataSetChanged();
      return;
      this.jxb.remove(localfr);
    }
  }

  public final boolean qz(int paramInt)
  {
    return CK(((com.tencent.mm.storage.i)getItem(paramInt)).getUsername()) != null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fq
 * JD-Core Version:    0.6.2
 */
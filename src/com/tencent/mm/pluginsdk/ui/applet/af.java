package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.al;
import com.tencent.mm.pluginsdk.ui.a;
import com.tencent.mm.protocal.a.abq;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class af extends BaseAdapter
{
  private boolean cKE;
  private List cKZ = new ArrayList();
  private com.tencent.mm.storage.b euc;
  private LinkedList gQe;
  private boolean gwe;
  private boolean hBA = false;
  private String hBB;
  private String hBC;
  private boolean hBD = false;
  private final int hBE;
  private com.tencent.mm.model.b hBF;
  private boolean hBG = true;
  private boolean hBH = false;
  private boolean hBI = true;
  private ag hBn;
  private ArrayList hBo = new ArrayList();
  private List hBp = new ArrayList();
  private Set hBq = new HashSet();
  private int hBr = 0;
  private int hBs = 0;
  private com.tencent.mm.pluginsdk.ui.e hBt;
  public boolean hBu = false;
  public boolean hBv = false;
  private boolean hBw = true;
  private boolean hBx = false;
  private int hBy = 12;
  private boolean hBz = false;
  private Context mContext;
  private String username;

  public af(Context paramContext)
  {
    this.mContext = paramContext;
    this.gwe = false;
    this.hBE = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.Pj);
    this.hBF = bg.qW();
  }

  private void aAK()
  {
    if (this.hBn != null)
      this.hBn.aAK();
  }

  private void aAL()
  {
    if (this.hBo == null)
      return;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.hBo.size());
    z.d("!56@/B4Tb64lLpLSOpQlr7qYXb1+w1rZ8NUC8yxejNWUy4uYgn7O9UIoWA==", "initData memberContactList.size %d", arrayOfObject);
    this.hBq.clear();
    this.hBp.clear();
    if (this.hBo.size() > 0)
    {
      Iterator localIterator = this.hBo.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.storage.i locali = (com.tencent.mm.storage.i)localIterator.next();
        this.hBp.add(locali);
        this.hBq.add(locali.getUsername());
      }
    }
    this.hBs = this.hBp.size();
  }

  private ah ag(View paramView)
  {
    ah localah = new ah(this);
    localah.egy = ((ImageView)paramView.findViewById(com.tencent.mm.i.aMA));
    localah.hBJ = ((ImageView)paramView.findViewById(com.tencent.mm.i.aMs));
    localah.ekE = ((TextView)paramView.findViewById(com.tencent.mm.i.aMy));
    localah.hBK = ((TextView)paramView.findViewById(com.tencent.mm.i.aMz));
    localah.ekH = ((ImageView)paramView.findViewById(com.tencent.mm.i.aMt));
    localah.egy.setScaleType(ImageView.ScaleType.FIT_XY);
    paramView.setTag(localah);
    return localah;
  }

  public final void E(ArrayList paramArrayList)
  {
    this.hBw = false;
    this.hBo = paramArrayList;
  }

  public final void T(List paramList)
  {
    ay(paramList);
    notifyChanged();
  }

  public final void a(ag paramag)
  {
    this.hBn = paramag;
  }

  public final void a(com.tencent.mm.pluginsdk.ui.e parame)
  {
    this.hBt = parame;
  }

  public final boolean aAM()
  {
    return this.gwe;
  }

  public final void aAN()
  {
    this.gwe = false;
    notifyChanged();
  }

  public final boolean aAO()
  {
    return this.hBr > this.hBy;
  }

  public final void ay(List paramList)
  {
    this.hBw = true;
    this.cKZ = paramList;
  }

  public final void dl(boolean paramBoolean)
  {
    this.hBA = true;
  }

  public final void dm(boolean paramBoolean)
  {
    this.hBI = false;
  }

  public final void dn(boolean paramBoolean)
  {
    this.hBx = paramBoolean;
  }

  public final int getCount()
  {
    if (this.hBx)
      return Math.min(this.hBy, this.hBr);
    return this.hBr;
  }

  public final Object getItem(int paramInt)
  {
    if (paramInt < this.hBs)
      return this.hBp.get(paramInt);
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.storage.i locali;
    int i;
    if (paramInt < this.hBs)
    {
      locali = (com.tencent.mm.storage.i)getItem(paramInt);
      i = 0;
    }
    while (true)
    {
      Object localObject;
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, k.blM, null);
        localObject = ag(paramView);
      }
      while (true)
      {
        label44: String str3;
        label83: CharSequence localCharSequence;
        label133: label170: label250: ImageView localImageView;
        String str1;
        if (i == 0)
        {
          ((ah)localObject).egy.setVisibility(0);
          if (this.cKE)
            if (!ch.jb(locali.ja()))
            {
              str3 = locali.ja();
              if (ch.jb(str3))
                str3 = locali.ja();
              if (ch.jb(str3))
                str3 = locali.oc();
              localCharSequence = com.tencent.mm.ar.b.f(this.mContext, str3, (int)((ah)localObject).ekE.getTextSize());
              if (!(localCharSequence instanceof SpannableString))
                break label506;
              ((ah)localObject).ekE.setVisibility(8);
              ((ah)localObject).hBK.setVisibility(0);
              ((ah)localObject).hBK.setText(localCharSequence);
              com.tencent.mm.pluginsdk.ui.c.a(((ah)localObject).egy, locali.getUsername());
              a locala = (a)((ah)localObject).egy.getDrawable();
              if (this.hBt != null)
                this.hBt.a(locala);
              if ((!this.gwe) || ((this.hBB != null) && (this.hBB.equals(locali.getUsername()))))
                break label538;
              ((ah)localObject).hBJ.setVisibility(0);
              if (locali == null)
                break label989;
              localImageView = ((ah)localObject).ekH;
              str1 = locali.getUsername();
              if ((this.gQe == null) || (this.gQe.isEmpty()))
                break label873;
              Iterator localIterator = this.gQe.iterator();
              while (true)
                if (localIterator.hasNext())
                  if (str1.equals(((abq)localIterator.next()).gnq))
                  {
                    localImageView.setVisibility(0);
                    if (this.hBD)
                      localImageView.setImageResource(h.acm);
                  }
            }
        }
        ah localah;
        label538: label989: 
        while (true)
        {
          ((ah)localObject).fjl = i;
          return paramView;
          if ((paramInt == this.hBs) && (this.hBv))
          {
            i = 3;
            locali = null;
            break;
          }
          if ((paramInt != 1 + this.hBs) || (!this.hBu))
            break label1009;
          i = 4;
          locali = null;
          break;
          localah = (ah)paramView.getTag();
          if (localah != null)
            break label1002;
          localObject = ag(paramView);
          break label44;
          String str2 = locali.getUsername();
          if (this.euc == null)
          {
            str3 = null;
            break label83;
          }
          if (!this.euc.aId())
          {
            str3 = null;
            break label83;
          }
          str3 = this.euc.dh(str2);
          break label83;
          localCharSequence = com.tencent.mm.ar.b.f(this.mContext, locali.od(), (int)((ah)localObject).ekE.getTextSize());
          break label133;
          label506: ((ah)localObject).ekE.setVisibility(0);
          ((ah)localObject).hBK.setVisibility(8);
          ((ah)localObject).ekE.setText(localCharSequence);
          break label170;
          ((ah)localObject).hBJ.setVisibility(8);
          break label250;
          if (i == 3)
          {
            ((ah)localObject).ekE.setVisibility(4);
            ((ah)localObject).hBK.setVisibility(4);
            ((ah)localObject).hBJ.setVisibility(8);
            if (this.gwe)
            {
              ((ah)localObject).egy.setVisibility(4);
              break label250;
            }
            ((ah)localObject).egy.setVisibility(0);
            ((ah)localObject).egy.setImageResource(h.Sk);
            ((ah)localObject).egy.setPadding(this.hBE, this.hBE, this.hBE, this.hBE);
            ((ah)localObject).egy.setContentDescription(this.mContext.getString(n.fgn));
            break label250;
          }
          if (i == 4)
          {
            ((ah)localObject).ekE.setVisibility(4);
            ((ah)localObject).hBK.setVisibility(4);
            ((ah)localObject).hBJ.setVisibility(8);
            if ((this.gwe) || (this.hBs == 0))
            {
              ((ah)localObject).egy.setVisibility(4);
              break label250;
            }
            ((ah)localObject).egy.setVisibility(0);
            ((ah)localObject).egy.setImageResource(h.Sl);
            ((ah)localObject).egy.setPadding(this.hBE, this.hBE, this.hBE, this.hBE);
            ((ah)localObject).egy.setContentDescription(this.mContext.getString(n.fxL));
            break label250;
          }
          if (i != 2)
            break label250;
          ((ah)localObject).ekE.setVisibility(4);
          ((ah)localObject).hBK.setVisibility(4);
          ((ah)localObject).hBJ.setVisibility(8);
          ((ah)localObject).egy.setVisibility(0);
          ((ah)localObject).egy.setImageResource(h.WT);
          ((ah)localObject).egy.setBackgroundResource(h.WT);
          break label250;
          localImageView.setImageResource(h.abB);
          continue;
          label873: if ((this.hBA) && (this.hBC != null) && (!ch.jb(this.hBC)) && (this.hBC.equals(str1)))
          {
            localImageView.setBackgroundResource(h.Uq);
            localImageView.setVisibility(0);
          }
          else if ((this.hBz) && (this.hBB != null) && (!ch.jb(this.hBB)) && (this.hBB.equals(str1)))
          {
            localImageView.setBackgroundResource(h.Ur);
            localImageView.setVisibility(0);
          }
          else
          {
            localImageView.setVisibility(8);
            continue;
            ((ah)localObject).ekH.setVisibility(8);
          }
        }
        label1002: localObject = localah;
      }
      label1009: i = 2;
      locali = null;
    }
  }

  public final boolean mA(int paramInt)
  {
    if (!this.gwe)
    {
      if (paramInt < this.hBs)
      {
        this.gwe = true;
        aAK();
      }
      return true;
    }
    return false;
  }

  public final boolean mB(int paramInt)
  {
    return (!this.gwe) && (paramInt == this.hBs);
  }

  public final boolean mC(int paramInt)
  {
    return (!this.gwe) && (paramInt == 1 + this.hBs);
  }

  public final boolean mD(int paramInt)
  {
    return paramInt < this.hBs;
  }

  public final void notifyChanged()
  {
    if ((this.cKZ != null) || (this.hBo != null))
    {
      if (!ch.jb(this.username))
      {
        if (com.tencent.mm.pluginsdk.g.axT() != null)
          this.gQe = com.tencent.mm.pluginsdk.g.axT().sV(this.username);
        if ((com.tencent.mm.pluginsdk.g.aya() == null) || (!com.tencent.mm.pluginsdk.g.aya().nR(this.username)))
          break label249;
      }
      label249: for (boolean bool = true; ; bool = false)
      {
        this.hBD = bool;
        if (!this.hBw)
          break label1190;
        if (this.cKZ == null)
          break label1135;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(this.cKZ.size());
        z.d("!56@/B4Tb64lLpLSOpQlr7qYXb1+w1rZ8NUC8yxejNWUy4uYgn7O9UIoWA==", "initData memberList.size %d", arrayOfObject1);
        this.hBq.clear();
        this.hBp.clear();
        if (this.cKZ.size() <= 0)
          break label1122;
        Iterator localIterator1 = this.cKZ.iterator();
        while (localIterator1.hasNext())
        {
          String str4 = (String)localIterator1.next();
          com.tencent.mm.storage.i locali5 = this.hBF.oT().ys(str4);
          if ((locali5 != null) && (!ch.jb(locali5.getUsername())) && (locali5.getUsername().equals(str4)))
          {
            this.hBp.add(locali5);
            this.hBq.add(str4);
          }
        }
      }
      if (this.hBq.size() < this.cKZ.size())
      {
        Iterator localIterator4 = this.cKZ.iterator();
        while (localIterator4.hasNext())
        {
          String str3 = (String)localIterator4.next();
          if (!this.hBq.contains(str3))
          {
            this.hBp.add(new com.tencent.mm.storage.i(str3));
            this.hBq.add(str3);
          }
        }
      }
      if ((this.hBG) && (!ch.jb(this.hBB)) && (this.cKZ.contains(this.hBB)))
      {
        Iterator localIterator3 = this.hBp.iterator();
        while (localIterator3.hasNext())
        {
          com.tencent.mm.storage.i locali4 = (com.tencent.mm.storage.i)localIterator3.next();
          if (this.hBB.equals(locali4.getUsername()))
          {
            this.hBp.remove(locali4);
            this.hBp.add(0, locali4);
          }
        }
      }
      if (this.hBH)
      {
        String str1 = ch.Y((String)this.hBF.oQ().get(2), "");
        if (this.cKZ.contains(str1))
        {
          this.hBq.remove(str1);
          Iterator localIterator2 = this.hBp.iterator();
          while (localIterator2.hasNext())
          {
            com.tencent.mm.storage.i locali3 = (com.tencent.mm.storage.i)localIterator2.next();
            if (str1.equals(locali3.getUsername()))
              this.hBp.remove(locali3);
          }
        }
        com.tencent.mm.storage.i locali1 = this.hBF.oT().ys(str1);
        LinkedList localLinkedList1;
        int j;
        label678: com.tencent.mm.storage.i locali2;
        if ((locali1 != null) && (!ch.jb(locali1.getUsername())) && (locali1.getUsername().equals(str1)))
        {
          this.hBp.add(1, locali1);
          this.hBq.add(str1);
          if ((!this.hBI) || (this.hBp.size() < 3))
            break label1122;
          int i = this.hBp.size();
          localLinkedList1 = new LinkedList();
          j = 0;
          if (j >= i)
            break label885;
          locali2 = (com.tencent.mm.storage.i)this.hBp.get(j);
          if (locali2.jc() <= 0)
            break label760;
          localLinkedList1.add(locali2.jc());
        }
        while (true)
        {
          j++;
          break label678;
          this.hBp.add(1, new com.tencent.mm.storage.i(str1));
          break;
          label760: if (!ch.jb(locali2.ja()))
            localLinkedList1.add(locali2.ja());
          else if (!ch.jb(locali2.jh()))
            localLinkedList1.add(locali2.jh());
          else if (!ch.jb(locali2.jg()))
            localLinkedList1.add(locali2.jg());
          else if (!ch.jb(locali2.iW()))
            localLinkedList1.add(locali2.iW());
          else if (!ch.jb(locali2.getUsername()))
            localLinkedList1.add(locali2.getUsername());
        }
        label885: Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localLinkedList1.toString();
        z.v("!56@/B4Tb64lLpLSOpQlr7qYXb1+w1rZ8NUC8yxejNWUy4uYgn7O9UIoWA==", "klem, order list:%s", arrayOfObject2);
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(this.hBp.get(0));
        localArrayList.add(this.hBp.get(1));
        LinkedList localLinkedList2 = new LinkedList();
        localLinkedList2.add(localLinkedList1.get(0));
        localLinkedList2.add(localLinkedList1.get(0));
        int k = this.hBp.size();
        for (int m = 2; m < k; m++)
        {
          String str2 = (String)localLinkedList1.get(m);
          int n = localArrayList.size();
          for (int i1 = 1; (i1 < n) && (str2.compareToIgnoreCase((String)localLinkedList2.get(i1)) >= 0); i1++);
          localLinkedList2.add(i1, str2);
          localArrayList.add(i1, this.hBp.get(m));
        }
        this.hBp.clear();
        this.hBp = localArrayList;
      }
      label1122: this.hBs = this.hBp.size();
      label1135: if (this.hBs != 0)
        break label1197;
      this.hBr = 4;
    }
    while (true)
    {
      z.d("!56@/B4Tb64lLpLSOpQlr7qYXb1+w1rZ8NUC8yxejNWUy4uYgn7O9UIoWA==", "Number Size  contactSize :" + this.hBs + " realySize : " + this.hBr);
      aAK();
      return;
      label1190: aAL();
      break;
      label1197: if ((this.hBv) && (this.hBu))
        this.hBr = (4 * (1 + (1 + this.hBs) / 4));
      else if (((this.hBv) && (!this.hBu)) || ((!this.hBv) && (this.hBu)))
        this.hBr = (4 * (1 + this.hBs / 4));
      else if ((!this.hBv) && (!this.hBu))
        this.hBr = (4 * (1 + (-1 + this.hBs) / 4));
    }
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
    this.cKE = y.dc(paramString);
    this.euc = this.hBF.oZ().xS(paramString);
  }

  public final void vz(String paramString)
  {
    this.hBB = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.af
 * JD-Core Version:    0.6.2
 */
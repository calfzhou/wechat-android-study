package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelsearch.FTSUtils;
import com.tencent.mm.modelsearch.a;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.MaskLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class da extends dc
{
  private List fpG = null;
  private int gnp = 2147483647;
  private int gns = 2147483647;
  private List jAA = null;
  private HashSet jAB = new HashSet();
  private int jAC = 2147483647;
  private int[] jAD = null;
  private int jAw = 2147483647;
  private int jAx = 2147483647;
  private int jAy = 2147483647;
  private int jAz = 4;
  private String jwY = "@all.contact.without.chatroom";
  private int[] jxe = null;
  private String[] jxf = null;
  private int type = 0;

  public da(Context paramContext)
  {
    super(paramContext);
  }

  private String K(com.tencent.mm.storage.i parami)
  {
    if (parami.jc() == 123)
      return "#";
    if (parami.jc() == 43)
      return getContext().getResources().getString(n.brW);
    return String.valueOf((char)parami.jc());
  }

  private void aXi()
  {
    int i = 0;
    this.jxe = y.a(this.jwY, "", Gb(), "");
    this.jxf = y.a(this.jwY, "", "", Gb());
    this.jAD = null;
    if (this.jxe != null)
    {
      z.d("!44@/B4Tb64lLpJd2k1A7x9MPl58HpWTTNlRuOxkFP76Sf8=", "reset : showSection = " + this.jxf.length + " secPos = " + this.jxe.length + " count = " + getCount());
      int j;
      if (getCount() > 0)
      {
        j = getCount();
        this.jAD = new int[j];
      }
      while (true)
      {
        if (i >= this.jxe.length)
          return;
        if (i < -1 + this.jxe.length);
        for (int k = this.jxe[(i + 1)]; ; k = j)
        {
          for (int m = this.jxe[i]; m < k; m++)
            this.jAD[m] = i;
          j = 0;
          break;
        }
        i++;
      }
    }
  }

  private boolean aXj()
  {
    return (0x10 & this.type) == 16;
  }

  public final void Cc()
  {
    clearCache();
    closeCursor();
  }

  public final void Cy(String paramString)
  {
    if (this.jAB.contains(paramString))
      this.jAB.remove(paramString);
    while (true)
    {
      notifyDataSetChanged();
      return;
      this.jAB.add(paramString);
    }
  }

  public final void RM()
  {
    int i = 1;
    Cc();
    if (aXr())
    {
      this.fpG = null;
      this.jAA = null;
      this.gnp = 2147483647;
      this.gns = 2147483647;
      this.fpG = FTSUtils.a(aXs(), a.dBy, 131072, 131072);
      this.jAA = FTSUtils.a(aXs(), a.dBy, 131073, 131073);
      if (this.fpG.size() > 0)
        this.gnp = 0;
      if (this.jAA.size() > 0)
      {
        if (this.fpG.size() > 0)
          this.gns = this.fpG.size();
      }
      else
        return;
      this.gns = 0;
      return;
    }
    if (aXj())
    {
      this.jAC = 0;
      setCursor(bg.qW().oW().d(y.dkj, Gb(), ""));
      return;
    }
    this.jAw = 2147483647;
    this.jAx = 2147483647;
    this.jAy = 2147483647;
    ArrayList localArrayList = new ArrayList();
    int j;
    if ((0x10000 & this.type) == 65536)
    {
      j = i;
      if (j == 0)
        break label421;
      Cursor localCursor2 = cj.bd(Gb());
      localArrayList.add(localCursor2);
      k = localCursor2.getCount();
      if (k <= this.jAz);
    }
    label267: label407: label415: label421: for (int k = this.jAz; ; k = 0)
    {
      Cursor localCursor1;
      if ((0x1000 & this.type) == 4096)
      {
        if (i == 0)
          break label415;
        localCursor1 = bg.qW().oT().d(Gb(), false);
        localArrayList.add(localCursor1);
      }
      for (int m = localCursor1.getCount(); ; m = 0)
      {
        if (k > 0)
          this.jAw = 0;
        if (m > 0)
          if (k <= 0)
            break label407;
        for (this.jAx = k; ; this.jAx = 0)
        {
          this.jAy = (k + m);
          localArrayList.add(bg.qW().oT().a(this.jwY, "", Gb(), false, false));
          setCursor(new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0])));
          aXi();
          return;
          j = 0;
          break;
          i = 0;
          break label267;
        }
      }
    }
  }

  public final String[] aWJ()
  {
    return this.jxf;
  }

  public final int aXh()
  {
    return this.jAx;
  }

  public final void aXk()
  {
    this.type = (0x10 | this.type);
  }

  public final void aXl()
  {
    this.type = (0x1000 | this.type);
  }

  public final void aXm()
  {
    this.type = (0x10000 | this.type);
  }

  public final void aXn()
  {
    this.type = (0x1 | this.type);
  }

  public final HashSet aXo()
  {
    return this.jAB;
  }

  public final void aXp()
  {
    for (int i = 0; i < getCount(); i++)
    {
      bc localbc = (bc)getItem(i);
      this.jAB.add(localbc.elz.getUsername());
    }
    notifyDataSetChanged();
  }

  public final void aXq()
  {
    this.jAB.clear();
    notifyDataSetChanged();
  }

  public final int getPositionForSection(int paramInt)
  {
    if ((this.jxe != null) && (paramInt >= 0) && (paramInt < this.jxe.length))
      paramInt = this.jxe[paramInt];
    return paramInt + this.jAy;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(getContext()).inflate(k.bdB, paramViewGroup, false);
      db localdb2 = new db();
      localdb2.egz = ((TextView)paramView.findViewById(com.tencent.mm.i.aoA));
      localdb2.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.aoy));
      localdb2.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.aoD));
      localdb2.egC = ((CheckBox)paramView.findViewById(com.tencent.mm.i.aoE));
      localdb2.jAE = ((TextView)paramView.findViewById(com.tencent.mm.i.aow));
      paramView.setTag(localdb2);
    }
    db localdb1 = (db)paramView.getTag();
    bc localbc1 = (bc)getItem(paramInt);
    String str1;
    com.tencent.mm.storage.i locali;
    CharSequence localCharSequence1;
    if (aXr())
      if (paramInt == this.gnp)
      {
        str1 = getContext().getResources().getString(n.brY);
        if (str1 == null)
          break label688;
        localdb1.egz.setVisibility(0);
        localdb1.egz.setText(str1);
        c.a((ImageView)localdb1.eoy.getContentView(), localbc1.elz.getUsername());
        locali = localbc1.elz;
        localCharSequence1 = locali.aHW();
        if (localCharSequence1 != null)
          break label709;
      }
    while (true)
    {
      try
      {
        Context localContext = getContext();
        locali.getUsername();
        String str2 = y.dh(locali.getUsername());
        if (("".length() > 0) && (!"".equals(str2)))
        {
          StringBuilder localStringBuilder = new StringBuilder(32);
          localStringBuilder.append(str2);
          localStringBuilder.append("(");
          localStringBuilder.append("");
          localStringBuilder.append(")");
          str2 = localStringBuilder.toString();
        }
        CharSequence localCharSequence2 = com.tencent.mm.ar.b.f(localContext, str2, (int)localdb1.egA.getTextSize());
        localObject = localCharSequence2;
        if (localObject == null)
          localObject = "";
        localdb1.egA.setText((CharSequence)localObject);
        locali.q((CharSequence)localObject);
        if (localbc1.jyw == null)
          break label722;
        localdb1.jAE.setVisibility(0);
        localdb1.jAE.setText(localbc1.jyw);
        if (!this.jAB.contains(localbc1.elz.getUsername()))
          break label735;
        localdb1.egC.setChecked(true);
        if ((0x1 & this.type) != 1)
          break label747;
        i = 1;
        if (i == 0)
          break label753;
        localdb1.egC.setVisibility(0);
        return paramView;
        if (paramInt == this.gns)
        {
          str1 = getContext().getResources().getString(n.brW);
          break;
        }
        str1 = null;
        break;
        if (aXj())
        {
          if (paramInt == this.jAC)
          {
            str1 = getContext().getResources().getString(n.cdC);
            break;
          }
          str1 = null;
          break;
        }
        if (paramInt == this.jAw)
        {
          str1 = getContext().getResources().getString(n.bsl);
          break;
        }
        if (paramInt == this.jAx)
        {
          str1 = getContext().getResources().getString(n.bsg);
          break;
        }
        if (paramInt == this.jAy)
        {
          str1 = K(((bc)getItem(paramInt)).elz);
          break;
        }
        if (paramInt > this.jAy)
        {
          bc localbc2 = (bc)getItem(paramInt - 1);
          bc localbc3 = (bc)getItem(paramInt);
          if (localbc2 == null)
          {
            str1 = K(localbc3.elz);
            break;
          }
          String str3 = K(localbc2.elz);
          str1 = K(localbc3.elz);
          if (!str3.equals(str1))
            break;
        }
        str1 = null;
        break;
        label688: localdb1.egz.setVisibility(8);
      }
      catch (Exception localException)
      {
        Object localObject = null;
        continue;
      }
      label709: localdb1.egA.setText(localCharSequence1);
      continue;
      label722: localdb1.jAE.setVisibility(8);
      continue;
      label735: localdb1.egC.setChecked(false);
      continue;
      label747: int i = 0;
    }
    label753: localdb1.egC.setVisibility(8);
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.da
 * JD-Core Version:    0.6.2
 */
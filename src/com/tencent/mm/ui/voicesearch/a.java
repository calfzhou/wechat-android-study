package com.tencent.mm.ui.voicesearch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.MergeCursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.c.a.lo;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.v;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.af;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class a extends cb
{
  private String dWU;
  private com.tencent.mm.ui.applet.b dtE = new com.tencent.mm.ui.applet.b(new b(this));
  private com.tencent.mm.ui.applet.f dtF = null;
  protected List edM = null;
  private ColorStateList[] jFh = new ColorStateList[2];
  private HashMap jFi;
  private boolean jFj = true;
  private e jZs;

  public a(Context paramContext, cc paramcc)
  {
    super(paramContext, new r());
    super.a(paramcc);
    this.jFh[0] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Ox);
    this.jFh[1] = com.tencent.mm.aq.a.m(paramContext, com.tencent.mm.f.Oy);
    this.jFi = new HashMap();
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

  public final void DW()
  {
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = bg.qW().oW().b(y.dkj, this.edM, this.dWU);
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
        z.d("!56@/B4Tb64lLpIuhwFNmr0jFWYgIN094j0aBZ18bmsj7hGfIxUgiYP/JA==", "block user " + str);
      }
    }
    catch (Exception localException)
    {
      arrayOfCursor[1] = bg.qW().oT().b(this.dWU, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      setCursor(new MergeCursor(arrayOfCursor));
      if ((this.jZs != null) && (this.dWU != null))
        getCursor().getCount();
      super.notifyDataSetChanged();
    }
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(String paramString, ao paramao)
  {
    if ((paramString != null) && (!paramString.equals("")) && (this.jFi != null))
      this.jFi.remove(paramString);
    while (true)
    {
      super.a(paramString, paramao);
      return;
      if (this.jFi != null)
        this.jFi.clear();
    }
  }

  public final void bc(List paramList)
  {
    this.edM = paramList;
    a(null, null);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.dtF == null)
      this.dtF = new c(this);
    if (this.dtE != null)
      this.dtE.a(paramInt, this.dtF);
    r localr = (r)getItem(paramInt);
    if ((kx(localr.jN()) == 34) && (localr.jK() == 0) && (!ap.jb(localr.getContent())))
    {
      String str2 = localr.getContent();
      if ((localr.getUsername().equals("qmessage")) || (localr.getUsername().equals("floatbottle")))
      {
        String[] arrayOfString = str2.split(":");
        if ((arrayOfString != null) && (arrayOfString.length > 3))
          str2 = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
      }
      if (new bp(str2).BH());
    }
    for (int i = 1; ; i = 0)
    {
      f localf;
      Object localObject2;
      label446: int j;
      int k;
      String str1;
      int m;
      label506: Object localObject3;
      label534: int i2;
      if (paramView == null)
      {
        localf = new f();
        paramView = View.inflate(this.context, k.bmk, null);
        localf.egy = ((ImageView)paramView.findViewById(com.tencent.mm.i.ahd));
        localf.ekE = ((TextView)paramView.findViewById(com.tencent.mm.i.aGn));
        localf.ekF = ((TextView)paramView.findViewById(com.tencent.mm.i.aTY));
        localf.ekG = ((TextView)paramView.findViewById(com.tencent.mm.i.azM));
        localf.ekI = ((TextView)paramView.findViewById(com.tencent.mm.i.aST));
        localf.jFZ = ((ImageView)paramView.findViewById(com.tencent.mm.i.ayi));
        localf.jGa = ((ImageView)paramView.findViewById(com.tencent.mm.i.aSx));
        paramView.setTag(localf);
        Object localObject1 = (d)this.jFi.get(localr.getUsername() + localr.getContent());
        d locald;
        if (localObject1 == null)
        {
          locald = new d(this, (byte)0);
          locald.nickName = com.tencent.mm.ar.b.e(this.context, y.dh(localr.getUsername()), (int)localf.ekE.getTextSize());
          if (localr.getStatus() != 1)
            break label1094;
          localObject2 = this.context.getString(n.bRf);
          locald.jFI = ((CharSequence)localObject2);
          j = (int)localf.ekG.getTextSize();
          k = x.pK();
          str1 = localr.getUsername();
          if (ap.a((Integer)bg.qW().oQ().get(17)) != 1)
            break label1132;
          m = 1;
          if ((!str1.equals("qqmail")) || (m != 0))
            break label1138;
          localObject3 = this.context.getString(n.cgr);
          locald.jFJ = ((CharSequence)localObject3);
          if ((y.dc(localr.getUsername())) && (v.cW(localr.getUsername()) == 0))
            locald.nickName = this.context.getString(n.bAg);
        }
        switch (localr.getStatus())
        {
        case 3:
        case 4:
        default:
          i2 = -1;
          label623: locald.jFK = i2;
          this.jFi.put(localr.getUsername() + localr.getContent(), locald);
          localObject1 = locald;
          localf.ekG.setTextColor(this.jFh[i]);
          localf.ekE.setText(((d)localObject1).nickName);
          localf.ekF.setText(((d)localObject1).jFI);
          TextView localTextView = localf.ekG;
          localTextView.setText(com.tencent.mm.ar.b.c(this.context, ((d)localObject1).jFJ.toString(), (int)localf.ekG.getTextSize()));
          if (localr.jM() == 0L)
          {
            localf.ekF.setVisibility(8);
            label775: localf.jFZ.setVisibility(8);
            if (y.dc(localr.getUsername()))
            {
              com.tencent.mm.storage.i locali = bg.qW().oT().ys(localr.getUsername());
              if ((locali != null) && (locali.jv() == 0))
                localf.jFZ.setVisibility(0);
            }
            com.tencent.mm.pluginsdk.ui.c.a(localf.egy, localr.getUsername());
            if (this.jFj)
            {
              if (localr.jI() <= 100)
                break label1337;
              localf.ekI.setText("...");
              localf.ekI.setVisibility(0);
            }
            label884: if (bg.oE())
            {
              if (!y.a(localr))
              {
                bg.qW().oW();
                if (s.g(localr))
                  bg.qW().oW().f(localr);
              }
              bg.qW().oW();
              if (s.g(localr))
                break label1395;
              paramView.findViewById(com.tencent.mm.i.aoT).setBackgroundResource(h.Uj);
            }
          }
          break;
        case 0:
        case 1:
        case 2:
        case 5:
        }
      }
      lm locallm;
      while (true)
      {
        locallm = new lm();
        locallm.cOG.cOI = true;
        com.tencent.mm.sdk.c.a.aGB().g(locallm);
        if ((0L != s.a(localr, 7, 0L)) && (!localr.getUsername().equals(locallm.cOH.cOK)))
        {
          localr.l(s.a(localr, 6, localr.jM()));
          bg.qW().oW().a(localr, localr.getUsername());
        }
        if ((g.axT() != null) && (g.axT().sU(localr.getUsername())))
          break label1411;
        localf.jGa.setVisibility(8);
        return paramView;
        localf = (f)paramView.getTag();
        break;
        label1094: if (localr.jM() == 9223372036854775807L)
        {
          localObject2 = "";
          break label446;
        }
        localObject2 = com.tencent.mm.pluginsdk.e.m.b(this.context, localr.jM(), true);
        break label446;
        label1132: m = 0;
        break label506;
        label1138: cj localcj = bg.qW().oY().zX("@t.qq.com");
        if ((localcj != null) && (localcj.aJt()));
        for (int n = 1; ; n = 0)
        {
          if ((!str1.equals("tmessage")) || (n != 0))
            break label1205;
          localObject3 = this.context.getString(n.cgr);
          break;
        }
        label1205: if ((k & 0x40) != 0);
        for (int i1 = 1; ; i1 = 0)
        {
          if ((!str1.equals("qmessage")) || (i1 != 0))
            break label1253;
          localObject3 = this.context.getString(n.cgr);
          break;
        }
        label1253: localObject3 = com.tencent.mm.ar.b.c(this.context, com.tencent.mm.booter.notification.a.m.a(localr.jK(), localr.getUsername(), localr.getContent(), kx(localr.jN()), this.context), j);
        break label534;
        i2 = -1;
        break label623;
        i2 = h.Xb;
        break label623;
        i2 = -1;
        break label623;
        i2 = h.WZ;
        break label623;
        localf.ekF.setVisibility(0);
        break label775;
        label1337: if (localr.jI() > 0)
        {
          localf.ekI.setText(localr.jI());
          localf.ekI.setVisibility(0);
          break label884;
        }
        localf.ekI.setVisibility(4);
        break label884;
        label1395: paramView.findViewById(com.tencent.mm.i.aoT).setBackgroundResource(h.Ui);
      }
      label1411: localf.jGa.setVisibility(0);
      if (localr.getUsername().equals(locallm.cOH.cOK))
      {
        localf.jGa.setImageResource(h.abO);
        return paramView;
      }
      localf.jGa.setImageResource(h.abM);
      return paramView;
    }
  }

  public final void jI(String paramString)
  {
    this.dWU = paramString;
    closeCursor();
    DW();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.a
 * JD-Core Version:    0.6.2
 */
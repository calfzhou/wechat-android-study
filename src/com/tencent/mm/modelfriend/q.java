package com.tencent.mm.modelfriend;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.protocal.a.qy;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class q extends BaseAdapter
{
  private int cCB = 1;
  private Context context;
  private List dtA;
  private List dtB = new LinkedList();
  private int[] dtC;
  private w dtD;
  private b dtE = new b(new r(this));
  private com.tencent.mm.ui.applet.f dtF = null;
  private LinkedList dty = new LinkedList();
  private LinkedList dtz = new LinkedList();

  public q(Context paramContext, w paramw, int paramInt)
  {
    this.context = paramContext;
    this.cCB = paramInt;
    this.dtD = paramw;
    this.dtC = new int[this.dty.size()];
  }

  private void a(qy paramqy, String[] paramArrayOfString)
  {
    Iterator localIterator = this.dtz.iterator();
    while (localIterator.hasNext())
    {
      qy localqy = (qy)localIterator.next();
      if ((localqy.ifH != null) && (paramqy.ifH != null) && (localqy.ifH.equals(paramqy.ifH)))
      {
        z.d("!32@/B4Tb64lLpKtUZnUqFd8jYERHC2aCXs9", "tigerreg mobile already added");
        return;
      }
    }
    this.dtz.add(paramqy);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramArrayOfString[2];
    arrayOfString[1] = paramArrayOfString[1];
    this.dtB.add(arrayOfString);
  }

  public final void aa(boolean paramBoolean)
  {
    if (this.cCB == 1)
    {
      int k = 0;
      if (k < this.dtC.length)
      {
        int[] arrayOfInt2 = this.dtC;
        if (paramBoolean);
        for (int m = 1; ; m = 0)
        {
          arrayOfInt2[k] = m;
          k++;
          break;
        }
      }
    }
    else if (this.cCB == 2)
    {
      int i = 0;
      if (i < this.dtC.length)
      {
        int[] arrayOfInt1 = this.dtC;
        if (paramBoolean);
        for (int j = 2; ; j = 0)
        {
          arrayOfInt1[i] = j;
          i++;
          break;
        }
      }
    }
    notifyDataSetChanged();
  }

  public final void b(LinkedList paramLinkedList)
  {
    if (paramLinkedList != null)
    {
      this.dtz.clear();
      this.dty.clear();
      this.dtB.clear();
      Iterator localIterator1 = this.dtA.iterator();
      while (localIterator1.hasNext())
      {
        String[] arrayOfString = (String[])localIterator1.next();
        Iterator localIterator2 = paramLinkedList.iterator();
        while (localIterator2.hasNext())
        {
          qy localqy = (qy)localIterator2.next();
          if (this.cCB == 1)
          {
            if (((localqy.dZy == 1) || (localqy.dZy == 0)) && (!ch.jb(arrayOfString[2])) && (localqy.ifH.equals(com.tencent.mm.a.f.d(arrayOfString[2].getBytes()))))
              a(localqy, arrayOfString);
          }
          else if ((this.cCB == 2) && (localqy.dZy == 2) && (!ch.jb(arrayOfString[2])) && (localqy.ifH.equals(com.tencent.mm.a.f.d(arrayOfString[2].getBytes()))))
            a(localqy, arrayOfString);
        }
      }
    }
    this.dtC = new int[this.dtz.size()];
    this.dty.addAll(this.dtz);
    this.dtz.clear();
  }

  public final void detach()
  {
    if (this.dtE != null)
    {
      this.dtE.detach();
      this.dtE = null;
    }
  }

  public final void ds(int paramInt)
  {
    if (this.cCB == 1)
      this.dtC[paramInt] = 1;
    while (true)
    {
      notifyDataSetChanged();
      return;
      if (this.cCB == 2)
        this.dtC[paramInt] = 2;
    }
  }

  public final void dt(int paramInt)
  {
    if (this.cCB == 1)
      this.dtC[paramInt] = 0;
    while (true)
    {
      notifyDataSetChanged();
      return;
      if (this.cCB == 2)
        this.dtC[paramInt] = 0;
    }
  }

  public final qy du(int paramInt)
  {
    return (qy)this.dty.get(paramInt);
  }

  public final int getCount()
  {
    return this.dty.size();
  }

  public final long getItemId(int paramInt)
  {
    return ((qy)this.dty.get(paramInt)).hashCode();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.cCB == 1)
    {
      if (this.dtF == null)
        this.dtF = new s(this);
      if (this.dtE != null)
        this.dtE.a(paramInt, this.dtF);
    }
    qy localqy = (qy)this.dty.get(paramInt);
    x localx;
    if (paramView == null)
    {
      localx = new x();
      if (this.cCB == 1)
      {
        paramView = View.inflate(this.context, k.bfz, null);
        localx.dtJ = ((TextView)paramView.findViewById(i.aEH));
        localx.dtK = ((TextView)paramView.findViewById(i.aEA));
        localx.dtL = ((Button)paramView.findViewById(i.aEB));
        localx.dtM = ((Button)paramView.findViewById(i.aED));
        localx.dtI = ((ImageView)paramView.findViewById(i.auC));
        localx.dtN = ((TextView)paramView.findViewById(i.aEI));
        localx.dtO = ((TextView)paramView.findViewById(i.aEJ));
        paramView.setTag(localx);
        localx.dtO.setOnClickListener(new t(this, paramInt));
        if (this.cCB != 1)
          break label516;
        if (ch.jb(((String[])this.dtB.get(paramInt))[1]))
          break label473;
        localx.dtJ.setText(((String[])this.dtB.get(paramInt))[1]);
        label272: localx.dtL.setOnClickListener(new u(this, paramInt));
        c.a(localx.dtI, localqy.gnq);
        label302: switch (this.dtC[paramInt])
        {
        default:
        case 1:
        case 3:
        case 2:
        case 0:
        }
      }
    }
    label473: 
    do
    {
      return paramView;
      if (this.cCB != 2)
        break;
      paramView = View.inflate(this.context, k.bfA, null);
      localx.dtJ = ((TextView)paramView.findViewById(i.aEH));
      localx.dtK = ((TextView)paramView.findViewById(i.aEA));
      localx.dtL = ((Button)paramView.findViewById(i.aEB));
      localx.dtM = ((Button)paramView.findViewById(i.aED));
      localx.dtN = ((TextView)paramView.findViewById(i.aEI));
      localx.dtO = ((TextView)paramView.findViewById(i.aEJ));
      paramView.setTag(localx);
      break;
      localx = (x)paramView.getTag();
      break;
      if (ch.jb(localqy.hwV))
      {
        localx.dtJ.setText(localqy.gnq);
        break label272;
      }
      localx.dtJ.setText(localqy.hwV);
      break label272;
      if (this.cCB != 2)
        break label302;
      localx.dtJ.setText(((String[])this.dtB.get(paramInt))[1]);
      localx.dtM.setOnClickListener(new v(this, paramInt));
      break label302;
      localx.dtL.setVisibility(8);
      localx.dtK.setVisibility(0);
      localx.dtN.setVisibility(0);
      localx.dtO.setVisibility(0);
      return paramView;
      localx.dtL.setVisibility(8);
      localx.dtK.setVisibility(0);
      localx.dtN.setVisibility(0);
      localx.dtO.setVisibility(0);
      return paramView;
      localx.dtL.setVisibility(8);
      localx.dtM.setVisibility(8);
      localx.dtK.setVisibility(0);
      localx.dtN.setVisibility(0);
      localx.dtO.setVisibility(0);
      return paramView;
      if (this.cCB == 1)
      {
        localx.dtK.setVisibility(8);
        localx.dtL.setVisibility(0);
        localx.dtM.setVisibility(8);
        localx.dtN.setVisibility(8);
        localx.dtO.setVisibility(8);
        return paramView;
      }
    }
    while (this.cCB != 2);
    label516: localx.dtK.setVisibility(8);
    localx.dtL.setVisibility(8);
    localx.dtM.setVisibility(0);
    localx.dtN.setVisibility(8);
    localx.dtO.setVisibility(8);
    return paramView;
  }

  public final void gt(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.dtB.size(); i++)
      if (this.dtC[i] == 2)
        localArrayList.add(((String[])this.dtB.get(i))[0]);
    at localat = new at(paramString, localArrayList);
    bg.qX().d(localat);
  }

  public final void j(List paramList)
  {
    this.dtA = paramList;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    if (this.dtD != null)
      this.dtD.notifyDataSetChanged();
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.dtE != null)
      this.dtE.onTouchEvent(paramMotionEvent);
  }

  public final int vU()
  {
    int i = 0;
    int[] arrayOfInt = this.dtC;
    int j = arrayOfInt.length;
    int k = 0;
    if (k < j)
    {
      int m = arrayOfInt[k];
      if (this.cCB == 1)
        if (m == 1)
          i++;
      while (true)
      {
        k++;
        break;
        if ((this.cCB == 2) && (m == 2))
          i++;
      }
    }
    return i;
  }

  public final boolean vV()
  {
    if ((this.dtC == null) || (this.dtC.length == 0));
    int i;
    int j;
    do
    {
      return false;
      i = 0;
      if (i >= this.dtC.length)
        break label67;
      j = this.dtC[i];
      if (this.cCB != 1)
        break;
    }
    while (j == 0);
    while ((this.cCB != 2) || (j != 0))
    {
      i++;
      break;
    }
    return false;
    label67: return true;
  }

  public final void vW()
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    for (int i = 0; i < this.dty.size(); i++)
      if (this.dtC[i] == 1)
      {
        localLinkedList1.add(((qy)this.dty.get(i)).gnq);
        localLinkedList2.add(Integer.valueOf(52));
      }
    p localp = new p(2, localLinkedList1, localLinkedList2, "", "");
    bg.qX().d(localp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.q
 * JD-Core Version:    0.6.2
 */
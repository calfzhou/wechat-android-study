package com.tencent.mm.ui.friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.modelfriend.ah;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.protocal.a.jc;
import com.tencent.mm.protocal.a.tk;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.LinkedList;

final class bc extends BaseAdapter
{
  private LinkedList dRV;
  private boolean[] dXe;
  private final LayoutInflater fpT;
  private LinkedList jID;
  private boolean jIE;

  public bc(LayoutInflater paramLayoutInflater)
  {
    this.fpT = paramLayoutInflater;
  }

  public final void V(LinkedList paramLinkedList)
  {
    this.jID = paramLinkedList;
  }

  public final void a(LinkedList paramLinkedList, int paramInt)
  {
    if (paramInt < 0)
      this.dRV = paramLinkedList;
    while (true)
    {
      this.dXe = new boolean[this.dRV.size()];
      return;
      this.dRV = new LinkedList();
      for (int i = 0; i < paramLinkedList.size(); i++)
        if (paramInt == ((tk)paramLinkedList.get(i)).iaa)
          this.dRV.add(paramLinkedList.get(i));
    }
  }

  public final String[] aYF()
  {
    int i = 0;
    boolean[] arrayOfBoolean = this.dXe;
    int j = arrayOfBoolean.length;
    int k = 0;
    int m = 0;
    while (k < j)
    {
      if (arrayOfBoolean[k] != 0)
        m++;
      k++;
    }
    String[] arrayOfString = new String[m];
    int n = 0;
    int i2;
    if (n < this.dRV.size())
    {
      if (this.dXe[n] == 0)
        break label110;
      i2 = i + 1;
      arrayOfString[i] = ((tk)this.dRV.get(n)).gnq;
    }
    label110: for (int i1 = i2; ; i1 = i)
    {
      n++;
      i = i1;
      break;
      return arrayOfString;
    }
  }

  public final void eV(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.dXe.length))
      return;
    boolean[] arrayOfBoolean = this.dXe;
    if (this.dXe[paramInt] == 0);
    for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[paramInt] = i;
      super.notifyDataSetChanged();
      return;
    }
  }

  public final void fM(boolean paramBoolean)
  {
    this.jIE = paramBoolean;
  }

  public final int getCount()
  {
    if (this.jIE)
      if (this.jID != null);
    while (this.dRV == null)
    {
      return 0;
      return this.jID.size();
    }
    return this.dRV.size();
  }

  public final Object getItem(int paramInt)
  {
    if (this.jIE)
      return this.jID.get(paramInt);
    return this.dRV.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.jIE)
    {
      jc localjc = (jc)this.jID.get(paramInt);
      bd localbd3;
      if ((paramView == null) || (((bd)paramView.getTag()).type != 2))
      {
        paramView = this.fpT.inflate(com.tencent.mm.k.bgT, paramViewGroup, false);
        localbd3 = new bd();
        localbd3.type = 2;
        localbd3.eSC = ((TextView)paramView.findViewById(i.aIL));
        paramView.setTag(localbd3);
      }
      for (bd localbd4 = localbd3; ; localbd4 = (bd)paramView.getTag())
      {
        localbd4.eSC.setText(localjc.iab);
        return paramView;
      }
    }
    tk localtk = (tk)this.dRV.get(paramInt);
    bd localbd2;
    label270: String str1;
    label302: TextView localTextView2;
    String str2;
    if ((paramView == null) || (((bd)paramView.getTag()).type != 1))
    {
      paramView = this.fpT.inflate(com.tencent.mm.k.bgS, paramViewGroup, false);
      bd localbd1 = new bd();
      localbd1.type = 1;
      localbd1.egA = ((TextView)paramView.findViewById(i.ayO));
      localbd1.jIF = ((TextView)paramView.findViewById(i.ayM));
      localbd1.dXh = ((CheckBox)paramView.findViewById(i.ayP));
      localbd1.dXg = ((TextView)paramView.findViewById(i.ayL));
      paramView.setTag(localbd1);
      localbd2 = localbd1;
      if (!az.xd().gy(localtk.gnq))
        break label371;
      localbd2.dXg.setVisibility(0);
      TextView localTextView1 = localbd2.egA;
      if (localtk == null)
        break label454;
      str1 = localtk.hUE;
      if ((str1 == null) || (str1.length() <= 0))
        break label384;
      localTextView1.setText(str1);
      localTextView2 = localbd2.jIF;
      if (localtk == null)
        break label566;
      if (localtk.ifp != 0)
        break label461;
      str2 = localtk.gnq;
    }
    label384: label566: 
    while (true)
    {
      localTextView2.setText(str2);
      localbd2.dXh.setChecked(this.dXe[paramInt]);
      return paramView;
      localbd2 = (bd)paramView.getTag();
      break;
      label371: localbd2.dXg.setVisibility(8);
      break label270;
      str1 = localtk.hwV;
      if ((str1 != null) && (str1.length() > 0))
        break label302;
      str1 = new com.tencent.mm.a.k(localtk.hQv).toString();
      if ((str1 != null) && (str1.length() > 0))
        break label302;
      str1 = localtk.hQG;
      if ((str1 != null) && (str1.length() > 0))
        break label302;
      label454: str1 = "";
      break label302;
      label461: if (localtk.ifp == 2)
      {
        str2 = localtk.gnq;
      }
      else if (localtk.ifp == 1)
      {
        String str3 = localtk.gnq;
        if (!ch.jb(str3))
        {
          String[] arrayOfString = str3.split("@");
          if ((arrayOfString == null) || (arrayOfString.length < 2) || (ch.jb(arrayOfString[0])))
          {
            str2 = "";
            continue;
          }
          str2 = "@" + arrayOfString[0];
        }
      }
      else
      {
        str2 = "";
      }
    }
  }

  public final int qE(int paramInt)
  {
    if (!this.jIE)
      return 0;
    return ((jc)this.jID.get(paramInt)).iaa;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bc
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ai.b;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;
import junit.framework.Assert;

final class l extends BaseAdapter
{
  private l(AppAttachFileListUI paramAppAttachFileListUI)
  {
  }

  public final int getCount()
  {
    return AppAttachFileListUI.a(this.jlM).size();
  }

  public final Object getItem(int paramInt)
  {
    return AppAttachFileListUI.a(this.jlM).get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    n localn;
    m localm;
    if (paramView == null)
    {
      paramView = this.jlM.getLayoutInflater().inflate(k.baN, paramViewGroup, false);
      Assert.assertNotNull(paramView);
      localn = new n(this.jlM, (byte)0);
      localn.jlO = ((ImageView)paramView.findViewById(i.atr));
      localn.jlP = ((TextView)paramView.findViewById(i.att));
      localn.jlQ = ((TextView)paramView.findViewById(i.atq));
      localn.jlR = ((TextView)paramView.findViewById(i.ats));
      paramView.setTag(localn);
      Assert.assertNotNull(localn);
      localm = (m)AppAttachFileListUI.a(this.jlM).get(paramInt);
      localn.jlP.setText(localm.jlN.title);
      if (localm.cMM.jK() != 1)
        break label261;
    }
    label261: for (String str = "自己"; ; str = y.dh(localm.jlN.diG))
    {
      TextView localTextView = localn.jlQ;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = ch.Z(localm.jlN.dQW);
      arrayOfObject[1] = str;
      localTextView.setText(String.format("大小：%s，来自：%s", arrayOfObject));
      localn.jlR.setText(com.tencent.mm.pluginsdk.e.m.b(this.jlM, localm.cMM.kn(), true));
      localn.jlO.setImageResource(s.uT(localm.jlN.dQX));
      return paramView;
      localn = (n)paramView.getTag();
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l
 * JD-Core Version:    0.6.2
 */
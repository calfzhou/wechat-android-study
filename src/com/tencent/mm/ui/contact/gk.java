package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;

final class gk
  implements AdapterView.OnItemClickListener
{
  gk(VoipAddressUI paramVoipAddressUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.jCH.XF();
    bc localbc = (bc)VoipAddressUI.a(this.jCH).getItem(paramInt - 1);
    if (localbc == null);
    for (i locali = null; locali == null; locali = localbc.elz)
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(VoipAddressUI.a(this.jCH).getCount());
      arrayOfObject3[1] = Integer.valueOf(paramInt);
      z.e("!32@/B4Tb64lLpLsucrmy2Y99b8+/t/IjGYU", "on contactLV ItemClick, the item contact shoud not be null. count:%d, pos:%d ", arrayOfObject3);
      return;
    }
    mx localmx = new mx();
    localmx.cPr.cEg = 5;
    localmx.cPr.cEh = locali.getUsername();
    localmx.cPr.context = this.jCH;
    int i;
    if (VoipAddressUI.c(this.jCH))
    {
      i = 2;
      if (!VoipAddressUI.d(this.jCH))
        break label242;
      localmx.cPr.cPu = 2;
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = Integer.valueOf(1);
      arrayOfObject2[2] = Integer.valueOf(0);
      localn2.d(11033, arrayOfObject2);
    }
    while (true)
    {
      a.aGB().g(localmx);
      this.jCH.XF();
      this.jCH.finish();
      return;
      i = 1;
      break;
      label242: localmx.cPr.cPu = 3;
      n localn1 = n.fTF;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(i);
      arrayOfObject1[1] = Integer.valueOf(2);
      arrayOfObject1[2] = Integer.valueOf(0);
      localn1.d(11033, arrayOfObject1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gk
 * JD-Core Version:    0.6.2
 */
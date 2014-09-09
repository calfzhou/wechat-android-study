package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.e;
import java.util.List;

final class fv
  implements AdapterView.OnItemClickListener
{
  fv(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < SnsAddressUI.a(this.jCy).getHeaderViewsCount())
      return;
    int i = paramInt - SnsAddressUI.a(this.jCy).getHeaderViewsCount();
    SnsAddressUI.b(this.jCy).qx(i);
    int j = SnsAddressUI.b(this.jCy).aXy().size();
    if ((j + SnsAddressUI.c(this.jCy) > SnsAddressUI.gvf) && (SnsAddressUI.b(this.jCy).qz(i)))
    {
      SnsAddressUI.b(this.jCy).qx(i);
      e.b(this.jCy, n.cko, n.buo);
      return;
    }
    if (SnsAddressUI.b(this.jCy).aXx())
      this.jCy.t(1, true);
    while (true)
    {
      i locali = (i)SnsAddressUI.b(this.jCy).getItem(i);
      SnsAddressUI.a(this.jCy, locali.getUsername());
      SnsAddressUI localSnsAddressUI = this.jCy;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = this.jCy.getString(n.btQ);
      arrayOfObject[1] = Integer.valueOf(j + SnsAddressUI.c(this.jCy));
      arrayOfObject[2] = Integer.valueOf(SnsAddressUI.gvf);
      localSnsAddressUI.C(1, String.format("%s(%d/%d)", arrayOfObject));
      return;
      this.jCy.t(1, false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fv
 * JD-Core Version:    0.6.2
 */
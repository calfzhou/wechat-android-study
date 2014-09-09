package com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.z;

final class o
  implements AdapterView.OnItemClickListener
{
  o(ServiceAppUI paramServiceAppUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (ServiceAppUI.b(this.jKl) == null)
    {
      z.e("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "biz onItemClick bizServicePref null");
      return;
    }
    k localk = ServiceAppUI.b(this.jKl).mJ(paramInt);
    if (localk == null)
    {
      z.e("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "biz onItemClick app is null");
      return;
    }
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(localk.iZ());
    arrayOfObject[1] = localk.field_packageName;
    arrayOfObject[2] = localk.field_appId;
    z.i("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "onItemClick, jumpType[%d], package[%s], appid[%s]", arrayOfObject);
    ServiceAppUI.a(this.jKl, localk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.o
 * JD-Core Version:    0.6.2
 */
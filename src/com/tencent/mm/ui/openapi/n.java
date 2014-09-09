package com.tencent.mm.ui.openapi;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.z;

final class n
  implements AdapterView.OnItemClickListener
{
  n(ServiceAppUI paramServiceAppUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (ServiceAppUI.a(this.jKl) == null)
    {
      z.e("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "wx onItemClick wxServicePref null");
      return;
    }
    k localk = ServiceAppUI.a(this.jKl).mJ(paramInt);
    if (localk == null)
    {
      z.e("!32@/B4Tb64lLpICNjpbZsBI5qYbQsNvzDzA", "wx onItemClick app is null");
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
 * Qualified Name:     com.tencent.mm.ui.openapi.n
 * JD-Core Version:    0.6.2
 */
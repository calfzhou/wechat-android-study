package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.mm.af.b;
import com.tencent.mm.am.a;
import com.tencent.mm.model.y;
import com.tencent.mm.ui.base.cm;

final class q
  implements cm
{
  q(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 1:
      this.jLL.aZb();
      return;
    case 2:
      if (y.dc(SelfQRCodeUI.a(this.jLL)))
      {
        String str = b.hi(SelfQRCodeUI.a(this.jLL));
        a.b(this.jLL, "qqmail", ".ui.RoomInfoShareQrUI", new Intent().putExtra("from_userName", SelfQRCodeUI.a(this.jLL)).putExtra("qrcode_file_path", str));
        return;
      }
      this.jLL.aZc();
      return;
    case 3:
      this.jLL.Di(SelfQRCodeUI.a(this.jLL));
      return;
    case 4:
    }
    a.l(this.jLL.aPI(), "scanner", ".ui.BaseScanUI");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.q
 * JD-Core Version:    0.6.2
 */
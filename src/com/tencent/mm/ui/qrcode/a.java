package com.tencent.mm.ui.qrcode;

import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cg;
import com.tencent.mm.network.r;
import com.tencent.mm.ui.LauncherUI;

final class a
  implements cg
{
  a(GetQRCodeInfoUI paramGetQRCodeInfoUI)
  {
  }

  public final void a(r paramr)
  {
    if (paramr == null)
    {
      this.jKZ.finish();
      return;
    }
    if ((bg.oE()) && (!bg.rd()))
    {
      GetQRCodeInfoUI.a(this.jKZ, this.jKZ.getIntent().getDataString());
      return;
    }
    Intent localIntent = new Intent(this.jKZ, LauncherUI.class).addFlags(67108864);
    this.jKZ.startActivity(localIntent);
    this.jKZ.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.a
 * JD-Core Version:    0.6.2
 */
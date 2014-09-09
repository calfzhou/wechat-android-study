package com.tencent.mm.ui.qrcode;

import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.y;
import java.io.FileOutputStream;

final class q
  implements y
{
  q(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    ShowQRCodeStep1UI localShowQRCodeStep1UI;
    byte[] arrayOfByte;
    do
    {
      return;
      this.jLg.aYT();
      return;
      localShowQRCodeStep1UI = this.jLg;
      String str1 = x.pG();
      ap.a((Integer)bg.qW().oQ().get(66561));
      arrayOfByte = com.tencent.mm.af.b.hj(str1);
    }
    while ((arrayOfByte == null) || (arrayOfByte.length <= 0));
    String str2 = bc.aFg() + "mmqrcode" + System.currentTimeMillis() + ".png";
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(str2);
      localFileOutputStream.write(arrayOfByte);
      localFileOutputStream.close();
      Toast.makeText(localShowQRCodeStep1UI, localShowQRCodeStep1UI.getString(n.bDP, new Object[] { str2 }), 1).show();
      bc.e(str2, localShowQRCodeStep1UI);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.q
 * JD-Core Version:    0.6.2
 */
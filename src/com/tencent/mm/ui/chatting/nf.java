package com.tencent.mm.ui.chatting;

import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;
import java.util.ArrayList;

final class nf
  implements Runnable
{
  nf(SendImgProxyUI paramSendImgProxyUI)
  {
  }

  public final void run()
  {
    z.i("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "test before sendMutiImage");
    ArrayList localArrayList = SendImgProxyUI.w(this.jvz.getIntent());
    bg.qQ().aHq();
    z.i("!32@/B4Tb64lLpLg4gwftVtZgiXDZ+lAxGZd", "test before finish");
    SendImgProxyUI.a(this.jvz).dismiss();
    this.jvz.setResult(-1, this.jvz.getIntent().putIntegerArrayListExtra("GalleryUI_ImgIdList", localArrayList));
    SendImgProxyUI.aWv();
    this.jvz.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nf
 * JD-Core Version:    0.6.2
 */
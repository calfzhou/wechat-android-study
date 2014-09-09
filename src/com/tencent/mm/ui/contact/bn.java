package com.tencent.mm.ui.contact;

import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.y;

final class bn
  implements y
{
  bn(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      z.d("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "pick up an image");
      Intent localIntent = new Intent();
      localIntent.putExtra("max_select_count", 1);
      localIntent.putExtra("query_source_type", 0);
      localIntent.putExtra("send_btn_string", " ");
      localIntent.addFlags(67108864);
      a.a(this.jzm, "gallery", ".ui.GalleryEntryUI", localIntent, 200);
      return;
    case 1:
    }
    z.d("!44@9DU/RFsdGl+78IVsLr7e0lB3zxHTejPIMP7oYqhJXgY=", "delete the remark image when download failed.");
    ContactRemarkInfoModUI.v(this.jzm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bn
 * JD-Core Version:    0.6.2
 */
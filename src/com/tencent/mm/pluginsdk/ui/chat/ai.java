package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.am.a;
import java.util.ArrayList;

final class ai
  implements bc
{
  ai(ChatFooter paramChatFooter, Context paramContext)
  {
  }

  public final void vH(String paramString)
  {
    Intent localIntent = new Intent();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramString);
    if (ChatFooter.c(this.hDT) != null)
      localIntent.putExtra("GalleryUI_FromUser", ChatFooter.c(this.hDT));
    if (ChatFooter.d(this.hDT) != null)
      localIntent.putExtra("GalleryUI_ToUser", ChatFooter.d(this.hDT));
    localIntent.putExtra("query_source_type", 3);
    localIntent.putExtra("preview_image", true);
    localIntent.putStringArrayListExtra("preview_image_list", localArrayList);
    localIntent.putExtra("max_select_count", 1);
    localIntent.addFlags(67108864);
    if (ChatFooter.e(this.hDT) != null)
    {
      a.a(ChatFooter.e(this.hDT), "gallery", ".ui.GalleryEntryUI", localIntent, 217);
      return;
    }
    a.a(this.dLL, "gallery", ".ui.GalleryEntryUI", localIntent, 217);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ai
 * JD-Core Version:    0.6.2
 */
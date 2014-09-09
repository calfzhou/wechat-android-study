package com.tencent.mm.ui.friend;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.o.ac;

final class ci
  implements DialogInterface.OnCancelListener
{
  ci(RecommendFriendUI paramRecommendFriendUI, aa paramaa)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jJk);
    this.jJi.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ci
 * JD-Core Version:    0.6.2
 */
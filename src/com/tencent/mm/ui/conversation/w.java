package com.tencent.mm.ui.conversation;

import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import java.util.HashMap;

final class w
  implements as
{
  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    String str = (String)paramObject;
    if (r.a(this.jFF));
    while ((str == null) || (str.equals("")) || (r.b(this.jFF) == null) || (!r.b(this.jFF).containsKey(Integer.valueOf(paramInt))))
      return;
    r.b(this.jFF).remove(Integer.valueOf(paramInt));
    r.c(this.jFF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.w
 * JD-Core Version:    0.6.2
 */
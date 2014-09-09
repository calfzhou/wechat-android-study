package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.ch;
import java.util.ArrayList;
import java.util.Iterator;

final class ao
  implements aj, ak, al
{
  private ao(MMAutoSwitchEditTextView paramMMAutoSwitchEditTextView)
  {
  }

  public final void aRE()
  {
    Object localObject1 = "";
    Iterator localIterator = MMAutoSwitchEditTextView.a(this.iYz).iterator();
    MMAutoSwitchEditText localMMAutoSwitchEditText;
    if (localIterator.hasNext())
    {
      localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
      if (ch.jb(localMMAutoSwitchEditText.getText().toString().trim()))
        break label107;
    }
    label107: for (Object localObject2 = (String)localObject1 + localMMAutoSwitchEditText.getText().toString().trim(); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      if (MMAutoSwitchEditTextView.e(this.iYz) != null)
        MMAutoSwitchEditTextView.e(this.iYz).aQv();
      return;
    }
  }

  public final void pq(int paramInt)
  {
    if ((MMAutoSwitchEditTextView.a(this.iYz) == null) || (paramInt >= MMAutoSwitchEditTextView.a(this.iYz).size()) || (paramInt == 0));
    MMAutoSwitchEditText localMMAutoSwitchEditText;
    do
    {
      return;
      localMMAutoSwitchEditText = (MMAutoSwitchEditText)MMAutoSwitchEditTextView.a(this.iYz).get(paramInt - 1);
    }
    while (localMMAutoSwitchEditText == null);
    localMMAutoSwitchEditText.requestFocus();
  }

  public final void pr(int paramInt)
  {
    Object localObject1 = "";
    Iterator localIterator = MMAutoSwitchEditTextView.a(this.iYz).iterator();
    MMAutoSwitchEditText localMMAutoSwitchEditText2;
    if (localIterator.hasNext())
    {
      localMMAutoSwitchEditText2 = (MMAutoSwitchEditText)localIterator.next();
      if (ch.jb(localMMAutoSwitchEditText2.getText().toString().trim()))
        break label218;
    }
    label218: for (Object localObject2 = (String)localObject1 + localMMAutoSwitchEditText2.getText().toString().trim(); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      if ((!ch.jb((String)localObject1)) && (((String)localObject1).length() == MMAutoSwitchEditTextView.b(this.iYz) * MMAutoSwitchEditTextView.c(this.iYz)))
        if (MMAutoSwitchEditTextView.d(this.iYz) != null)
          MMAutoSwitchEditTextView.d(this.iYz).Bz((String)localObject1);
      MMAutoSwitchEditText localMMAutoSwitchEditText1;
      do
      {
        do
        {
          return;
          if (MMAutoSwitchEditTextView.e(this.iYz) != null)
            MMAutoSwitchEditTextView.e(this.iYz).aQv();
        }
        while ((MMAutoSwitchEditTextView.a(this.iYz) == null) || (paramInt >= -1 + MMAutoSwitchEditTextView.a(this.iYz).size()));
        localMMAutoSwitchEditText1 = (MMAutoSwitchEditText)MMAutoSwitchEditTextView.a(this.iYz).get(paramInt + 1);
      }
      while (localMMAutoSwitchEditText1 == null);
      localMMAutoSwitchEditText1.requestFocus();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ao
 * JD-Core Version:    0.6.2
 */
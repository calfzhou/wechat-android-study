package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.am.a;

final class cw
  implements DialogInterface.OnClickListener
{
  cw(cv paramcv, String paramString1, String paramString2, int paramInt, hd paramhd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("transaction_id", this.joJ);
    localIntent.putExtra("receiver_name", this.fSA);
    localIntent.putExtra("resend_msg_from_flag", 2);
    localIntent.putExtra("invalid_time", this.joK);
    a.b(this.joL.h(), "remittance", ".ui.RemittanceResendMsgUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cw
 * JD-Core Version:    0.6.2
 */
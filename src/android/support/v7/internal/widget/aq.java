package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;

final class aq
  implements DialogInterface.OnClickListener, au
{
  private AlertDialog qh;
  private ListAdapter qi;
  private CharSequence qj;

  private aq(ap paramap)
  {
  }

  public final void dismiss()
  {
    this.qh.dismiss();
    this.qh = null;
  }

  public final void h(CharSequence paramCharSequence)
  {
    this.qj = paramCharSequence;
  }

  public final boolean isShowing()
  {
    if (this.qh != null)
      return this.qh.isShowing();
    return false;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.qk.setSelection(paramInt);
    if (this.qk.ox != null)
    {
      ap localap = this.qk;
      this.qi.getItemId(paramInt);
      localap.h(null, paramInt);
    }
    dismiss();
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    this.qi = paramListAdapter;
  }

  public final void show()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.qk.getContext());
    if (this.qj != null)
      localBuilder.setTitle(this.qj);
    this.qh = localBuilder.setSingleChoiceItems(this.qi, this.qk.oz, this).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.aq
 * JD-Core Version:    0.6.2
 */
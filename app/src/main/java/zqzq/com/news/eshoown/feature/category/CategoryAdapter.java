package zqzq.com.news.eshoown.feature.category;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import zqzq.com.news.eshoown.R;
import zqzq.com.news.eshoown.base.BaseListAdapter;
import zqzq.com.news.eshoown.network.entity.CategoryPrimary;

/**
 * Created by gqq on 2017/2/24.
 */
// 一级分类的适配器
public class CategoryAdapter extends BaseListAdapter<CategoryPrimary,CategoryAdapter.ViewHolder> {

    @Override
    protected int getItemViewLayout() {
        return R.layout.item_primary_category;
    }

    @Override
    protected ViewHolder getItemViewHolder(View view) {
        return new ViewHolder(view);
    }

    class ViewHolder extends BaseListAdapter.ViewHolder{

        @BindView(R.id.text_category)
        TextView mTextCategory;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void bind(int position) {
            mTextCategory.setText(getItem(position).getName());
        }
    }
}






//// 一级分类的适配器
//public class CategoryAdapter extends BaseAdapter {
//
//    private List<CategoryPrimary> mData = new ArrayList<>();
//
//    // 对外提供一个方法
//    public void reset(List<CategoryPrimary> data){
//        mData.clear();
//        mData.addAll(data);
//        notifyDataSetChanged();
//    }
//
//    @Override
//    public int getCount() {
//        return mData.size();
//    }
//
//    @Override
//    public CategoryPrimary getItem(int position) {
//        return mData.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        ViewHolder viewHolder = null;
//
//        if (convertView == null) {
//            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_primary_category, parent, false);
//            viewHolder = new ViewHolder(convertView);
//            convertView.setTag(viewHolder);
//        }
//        viewHolder = (ViewHolder) convertView.getTag();
//        viewHolder.mTextCategory.setText(mData.get(position).getName());
//        return convertView;
//    }
//
//    static class ViewHolder {
//        @BindView(R.id.text_category)
//        TextView mTextCategory;
//
//        ViewHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }
//}

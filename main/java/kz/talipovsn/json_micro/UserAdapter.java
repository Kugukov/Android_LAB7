package kz.talipovsn.json_micro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<User> users;

    UserAdapter(Context context, List<User> states) {
        this.users = states;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public UserAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( UserAdapter.ViewHolder holder, int position) {
        User user = users.get(position);
        holder.nameView.setText(user.getName());
        holder.idView.setText(user.getId());
        holder.typeView.setText(user.getType());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, idView, typeView;
        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.name);
            idView = view.findViewById(R.id.id);
            typeView = view.findViewById(R.id.type);
        }
    }
}

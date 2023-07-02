package com.example.myandroidprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


/*  NOTE: inherits abstract class RecyclerView.Adapter
    therefore must implement abstract methods of RecyclerView.Adapter
    Purpose: acts as a bridge between an AdapterView and the underlying data for that view
    provides access to the data items, responsible for making a View for each item in data set
 */
public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectsViewHolder> {

    private final Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    // NOTE: returns total number of items in data set held by adapter
    @Override
    public int getItemCount() {
        return projects.length;
    }

    // NOTE: called when RecyclerView needs new RecyclerView.ViewHolder of given type to represent an item
    @NonNull
    @Override
    public ProjectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectsViewHolder(view);
    }

    // NOTE: called by RecyclerView to display data at specified position
    // should update contents of RecyclerView.ViewHolder.itemView to reflect the item at given position
    @Override
    public void onBindViewHolder(@NonNull ProjectsViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    // NOTE: describes an item view and metadata about its place within RecyclerView
    static class ProjectsViewHolder extends RecyclerView.ViewHolder {
        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public ProjectsViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_project_title);
            appDescription = itemView.findViewById(R.id.text_view_project_description);
        }

        public void bind(Project project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}

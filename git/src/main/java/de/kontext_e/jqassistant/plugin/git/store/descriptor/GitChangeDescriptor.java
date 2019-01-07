package de.kontext_e.jqassistant.plugin.git.store.descriptor;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Property;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Label("Change")
public interface GitChangeDescriptor extends GitDescriptor {

    @Property("modificationKind")
    String getModificationKind();
    void setModificationKind(String modificationKind);

    @Property("deletions")
    Integer getDeletions();
    void setDeletions(Integer deletions);

    @Property("insertions")
    Integer getInsertions();
    void setInsertions(Integer insertions);

    @Property("deletionCharacters")
    Integer getDeletionCharacters();
    void setDeletionCharacters(Integer deletionCharacters);

    @Property("insertionCharacters")
    Integer getInsertionCharacters();
    void setInsertionCharacters(Integer insertionCharacters);

    @Relation("MODIFIES")
    GitFileDescriptor getModifies();
    void setModifies(GitFileDescriptor gitFileDescriptor);

    @Relation("CREATES")
    GitFileDescriptor getCreates();
    void setCreates(GitFileDescriptor gitFileDescriptor);

    @Relation("UPDATES")
    GitFileDescriptor getUpdates();
    void setUpdates(GitFileDescriptor gitFileDescriptor);

    @Relation("DELETES")
    GitFileDescriptor getDeletes();
    void setDeletes(GitFileDescriptor gitFileDescriptor);

    @Relation("RENAMES")
    GitFileDescriptor getRenames();
    void setRenames(GitFileDescriptor gitFileDescriptor);

    @Relation("COPIES")
    GitFileDescriptor getCopies();
    void setCopies(GitFileDescriptor gitFileDescriptor);
}

/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxException;

/**
 * The request builder returned by {@link
 * DbxUserFilesRequests#listFolderGetLatestCursorBuilder}.
 *
 * <p> Use this class to set optional request parameters and complete the
 * request. </p>
 */
public class ListFolderGetLatestCursorBuilder {
    private final DbxUserFilesRequests _client;
    private final ListFolderArg.Builder _builder;

    /**
     * Creates a new instance of this builder.
     *
     * @param _client  Dropbox namespace-specific client used to issue files
     *     requests.
     * @param _builder  Request argument builder.
     *
     * @return instsance of this builder
     */
    ListFolderGetLatestCursorBuilder(DbxUserFilesRequests _client, ListFolderArg.Builder _builder) {
        if (_client == null) {
            throw new NullPointerException("_client");
        }
        this._client = _client;
        if (_builder == null) {
            throw new NullPointerException("_builder");
        }
        this._builder = _builder;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code false}. </p>
     *
     * @param recursive  If true, the list folder operation will be applied
     *     recursively to all subfolders and the response will contain contents
     *     of all subfolders. Defaults to {@code false} when set to {@code
     *     null}.
     *
     * @return this builder
     */
    public ListFolderGetLatestCursorBuilder withRecursive(Boolean recursive) {
        this._builder.withRecursive(recursive);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code false}. </p>
     *
     * @param includeMediaInfo  If true, {@link FileMetadata#getMediaInfo} is
     *     set for photo and video. Defaults to {@code false} when set to {@code
     *     null}.
     *
     * @return this builder
     */
    public ListFolderGetLatestCursorBuilder withIncludeMediaInfo(Boolean includeMediaInfo) {
        this._builder.withIncludeMediaInfo(includeMediaInfo);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code false}. </p>
     *
     * @param includeDeleted  If true, the results will include entries for
     *     files and folders that used to exist but were deleted. Defaults to
     *     {@code false} when set to {@code null}.
     *
     * @return this builder
     */
    public ListFolderGetLatestCursorBuilder withIncludeDeleted(Boolean includeDeleted) {
        this._builder.withIncludeDeleted(includeDeleted);
        return this;
    }

    /**
     * Set value for optional field.
     *
     * <p> If left unset or set to {@code null}, defaults to {@code false}. </p>
     *
     * @param includeHasExplicitSharedMembers  If true, the results will include
     *     a flag for each file indicating whether or not  that file has any
     *     explicit members. Defaults to {@code false} when set to {@code null}.
     *
     * @return this builder
     */
    public ListFolderGetLatestCursorBuilder withIncludeHasExplicitSharedMembers(Boolean includeHasExplicitSharedMembers) {
        this._builder.withIncludeHasExplicitSharedMembers(includeHasExplicitSharedMembers);
        return this;
    }

    /**
     * Issues the request.
     */
    public ListFolderGetLatestCursorResult start() throws ListFolderErrorException, DbxException {
        ListFolderArg arg_ = this._builder.build();
        return _client.listFolderGetLatestCursor(arg_);
    }
}
